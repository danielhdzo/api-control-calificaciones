package com.examen.controlcalif.controller;

import java.io.FileNotFoundException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("api/v1/calificaciones")
@Api(protocols = "HTTP", value = "Endpoint de los servicios REST de Calificaciones")
public class CalificacionController {

	@Autowired
	CalificacionesService calificacionesService;

	@PostMapping
	@ApiOperation(value = "Da de alta una calificación para el alumno.")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Calificacion registrada."), })
	public ResponseEntity<ResponseExitoDTO> agregarCalificacion(@Valid @RequestBody CalificacionDTO calificacionDTO) {
		return calificacionesService.agregarCalificacion(calificacionDTO);
	}

	@GetMapping("/{idAlumno}")
	@ApiOperation(value = "Devuelve el listado de las calificaciones, y el promedio del alumno.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Listado de calificaciones encontrado."), })
	public ResponseEntity<List<Object>> obtenerCalificacionesPorAlumno(@PathVariable Long idAlumno) {
		return calificacionesService.obtenerCalificacionesPorAlumno(idAlumno);
	}

	@PutMapping("/{idCalificacion}")
	@ApiOperation(value = "Actualiza la calificación de un alumno.")
	@ApiResponses(value = { @ApiResponse(code = 202, message = "Calificacion actualizada."), })
	public ResponseEntity<ResponseExitoDTO> actualizarCalificacion(@PathVariable Long idCalificacion,
			@Valid @RequestBody CalificacionDTO calificacionActualizada) {
		return calificacionesService.actualizarCalificacion(idCalificacion, calificacionActualizada);
	}

	@DeleteMapping("/{idCalificacion}")
	@ApiOperation(value = "Elimina la calificación de un alumno.")
	@ApiResponses(value = { @ApiResponse(code = 202, message = "Calificacion eliminada."), })
	public ResponseEntity<ResponseExitoDTO> eliminarCalificacion(@PathVariable Long idCalificacion) {
		return calificacionesService.eliminarCalificacion(idCalificacion);
	}

	@GetMapping("/export-pdf/{idAlumno}")
	@ApiOperation(value = "Genera un reporte PDF de las calificaciones de un alumno.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Reporte de calificaciones generado."), })
	public ResponseEntity<byte[]> exportPdf(@PathVariable Long idAlumno) throws JRException, FileNotFoundException {
		return calificacionesService.exportaReportePdf(idAlumno);
	}

}
