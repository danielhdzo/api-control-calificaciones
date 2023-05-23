package com.examen.controlcalif.service.impl;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.controlcalif.dto.CalificacionDTO;
import com.examen.controlcalif.dto.PromedioDTO;
import com.examen.controlcalif.dto.ResponseCalificacionDTO;
import com.examen.controlcalif.dto.ResponseExitoDTO;
import com.examen.controlcalif.error.AlumnoNotFoundException;
import com.examen.controlcalif.error.CalificacionesNotFoundException;
import com.examen.controlcalif.model.Alumno;
import com.examen.controlcalif.model.Calificacion;
import com.examen.controlcalif.model.Materia;
import com.examen.controlcalif.repository.AlumnoRepository;
import com.examen.controlcalif.repository.CalificacionRepository;
import com.examen.controlcalif.service.CalificacionesService;
import com.examen.controlcalif.util.Constantes;
import com.examen.controlcalif.util.GeneradorReportes;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
@Transactional
public class CalificacionesImpl implements CalificacionesService {

	@Autowired
	private CalificacionRepository calificacionRepository;

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private GeneradorReportes generadorReportes;

	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constantes.PATRON_FECHA);

	@Override
	public ResponseEntity<ResponseExitoDTO> agregarCalificacion(CalificacionDTO calificacionDTO) {
		Calificacion calificacion = mapCalificacionDtoToEntity(calificacionDTO);

		calificacionRepository.save(calificacion);

		ResponseExitoDTO respuesta = new ResponseExitoDTO("Calificacion registrada");

		return ResponseEntity.status(HttpStatus.OK).body(respuesta);
	}

	@Override
	public ResponseEntity<List<Object>> obtenerCalificacionesPorAlumno(Long idAlumno) {
		Optional<Alumno> alumno = alumnoRepository.findById(idAlumno);
		if (alumno.isEmpty()) {
			throw new AlumnoNotFoundException(idAlumno);
		}

		Calificacion probe = new Calificacion();
		probe.setAlumno(alumno.get());

		List<Calificacion> calificaciones = calificacionRepository.findAll(Example.of(probe));

		if (calificaciones.isEmpty()) {
			throw new CalificacionesNotFoundException();
		}

		List<Object> response = new ArrayList<>();
		for (Calificacion calificacion : calificaciones) {
			response.add(mapCalificacionToResponse(calificacion));
		}

		response.add(calcularPromedio(calificaciones));

		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<ResponseExitoDTO> actualizarCalificacion(Long idCalificacion, CalificacionDTO calificacionActualizada) {
		Optional<Calificacion> calificacion = calificacionRepository.findById(idCalificacion);
		if (calificacion.isEmpty()) {
			throw new CalificacionesNotFoundException();
		}

		calificacion.get().setCalificacion(calificacionActualizada.getCalificacion());
		calificacionRepository.save(calificacion.get());

		ResponseExitoDTO respuesta = new ResponseExitoDTO("Calificacion actualizada");

		return ResponseEntity.status(HttpStatus.OK).body(respuesta);
	}

	@Override
	public ResponseEntity<ResponseExitoDTO> eliminarCalificacion(Long idCalificacion) {
		Optional<Calificacion> calificacion = calificacionRepository.findById(idCalificacion);
		if (calificacion.isEmpty()) {
			throw new CalificacionesNotFoundException();
		}

		calificacionRepository.delete(calificacion.get());

		ResponseExitoDTO respuesta = new ResponseExitoDTO("Calificacion eliminada");

		return ResponseEntity.status(HttpStatus.OK).body(respuesta);
	}

	private ResponseCalificacionDTO mapCalificacionToResponse(Calificacion calificacion) {
		return new ResponseCalificacionDTO(
				calificacion.getAlumno().getIdAlumno(), 
				calificacion.getAlumno().getNombre(),
				calificacion.getAlumno().getApellidoPaterno(), 
				calificacion.getAlumno().getApellidoMaterno(), 
				calificacion.getMateria().getNombre(),
				calificacion.getCalificacion(), 
				simpleDateFormat.format(calificacion.getFechaRegistro()));
	}

	private Calificacion mapCalificacionDtoToEntity(CalificacionDTO calificacionDTO) {
		Calificacion calificacion = new Calificacion();

		Materia materia = new Materia();
		materia.setIdMateria(calificacionDTO.getIdMateria());
		calificacion.setMateria(materia);
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(calificacionDTO.getIdAlumno());
		calificacion.setAlumno(alumno);
		calificacion.setCalificacion(calificacionDTO.getCalificacion());
		Date fechaRegistro = new Date();
		if (calificacionDTO.getFechaRegistro() != null) {
			try {
				fechaRegistro = simpleDateFormat.parse(calificacionDTO.getFechaRegistro());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		calificacion.setFechaRegistro(fechaRegistro);

		return calificacion;
	}

	private PromedioDTO calcularPromedio(List<Calificacion> calificaciones) {
		Double suma = Double.parseDouble("0.0");
		Double promedio = Double.parseDouble("0.0");

		if (!calificaciones.isEmpty()) {
			for (Calificacion calificacion : calificaciones) {
				suma += calificacion.getCalificacion();
			}
			// Redondeo a dos decimales
			promedio = Math.round((suma / calificaciones.size()) * 100) / 100d;
		}

		return new PromedioDTO(promedio);
	}

	@Override
	public byte[] exportaReportePdf(Long idAlumno) throws JRException, FileNotFoundException {
		Optional<Alumno> alumno = alumnoRepository.findById(idAlumno);
		if (alumno.isEmpty()) {
			throw new AlumnoNotFoundException(idAlumno);
		}

		Calificacion probe = new Calificacion();
		probe.setAlumno(alumno.get());

		List<Calificacion> calificaciones = calificacionRepository.findAll(Example.of(probe));

		if (calificaciones.isEmpty()) {
			throw new CalificacionesNotFoundException();
		}

		List<ResponseCalificacionDTO> lstObjetos = new ArrayList<>();
		for (Calificacion calificacion : calificaciones) {
			lstObjetos.add(mapCalificacionToResponse(calificacion));
		}

		String nomReporte = "reports/CalificacionesReport.jrxml";
		Map<String, Object> params = new HashMap<>();
		params.put("nombreAlumno",
				new StringBuffer().append(alumno.get().getNombre()).append(" ")
						.append(alumno.get().getApellidoPaterno()).append(" ").append(alumno.get().getApellidoMaterno())
						.toString());
		params.put("calPromedio", calcularPromedio(calificaciones).getPromedio());
		params.put("calificacionesData", new JRBeanCollectionDataSource(lstObjetos));

		return generadorReportes.exportToPdf(nomReporte, params);
	}

}
