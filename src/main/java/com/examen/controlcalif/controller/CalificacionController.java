package com.examen.controlcalif.controller;

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
import com.examen.controlcalif.service.CalificacionesService;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {

	@Autowired
	CalificacionesService calificacionesService;

	@PostMapping
	public ResponseEntity<?> agregarCalificacion(@Valid @RequestBody CalificacionDTO calificacionDTO) {
		return calificacionesService.agregarCalificacion(calificacionDTO);
	}

	@GetMapping("/alumno/{idAlumno}")
	public ResponseEntity<?> obtenerCalificacionesPorAlumno(@PathVariable Long idAlumno) {
		return calificacionesService.obtenerCalificacionesPorAlumno(idAlumno);
	}

	@PutMapping("/{idCalificacion}")
	public ResponseEntity<?> actualizarCalificacion(@PathVariable Long idCalificacion,
			@Valid @RequestBody CalificacionDTO calificacionActualizada) {
		return calificacionesService.actualizarCalificacion(idCalificacion, calificacionActualizada);
	}

	@DeleteMapping("/{idCalificacion}")
	public ResponseEntity<?> eliminarCalificacion(@PathVariable Long idCalificacion) {
		return calificacionesService.eliminarCalificacion(idCalificacion);
	}

}
