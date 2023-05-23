package com.examen.controlcalif.controller;

import java.io.FileNotFoundException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.controlcalif.dto.CalificacionDTO;
import com.examen.controlcalif.dto.ResponseExitoDTO;
import com.examen.controlcalif.service.CalificacionesService;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("api/v1/calificaciones")
public class CalificacionController {

	@Autowired
	CalificacionesService calificacionesService;

	@PostMapping
	public ResponseEntity<ResponseExitoDTO> agregarCalificacion(@Valid @RequestBody CalificacionDTO calificacionDTO) {
		return calificacionesService.agregarCalificacion(calificacionDTO);
	}

	@GetMapping("/{idAlumno}")
	public ResponseEntity<List<Object>>  obtenerCalificacionesPorAlumno(@PathVariable Long idAlumno) {
		return calificacionesService.obtenerCalificacionesPorAlumno(idAlumno);
	}

	@PutMapping("/{idCalificacion}")
	public ResponseEntity<ResponseExitoDTO> actualizarCalificacion(@PathVariable Long idCalificacion,
			@Valid @RequestBody CalificacionDTO calificacionActualizada) {
		return calificacionesService.actualizarCalificacion(idCalificacion, calificacionActualizada);
	}

	@DeleteMapping("/{idCalificacion}")
	public ResponseEntity<ResponseExitoDTO> eliminarCalificacion(@PathVariable Long idCalificacion) {
		return calificacionesService.eliminarCalificacion(idCalificacion);
	}

	@GetMapping("/export-pdf/{idAlumno}")
	public ResponseEntity<byte[]> exportPdf(@PathVariable Long idAlumno) throws JRException, FileNotFoundException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_PDF);
		headers.setContentDispositionFormData("calificacionesReport", "CalificacionesReport.pdf");
		return ResponseEntity.ok().headers(headers).body(calificacionesService.exportaReportePdf(idAlumno));
	}

}
