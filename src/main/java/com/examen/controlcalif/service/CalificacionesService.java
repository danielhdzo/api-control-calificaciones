package com.examen.controlcalif.service;

import org.springframework.http.ResponseEntity;

import com.examen.controlcalif.dto.CalificacionDTO;

public interface CalificacionesService {

	public ResponseEntity<?> agregarCalificacion(CalificacionDTO calificacion);

	public ResponseEntity<?> obtenerCalificacionesPorAlumno(Long idAlumno);

	public ResponseEntity<?> actualizarCalificacion(Long idCalificacion, CalificacionDTO calificacionActualizada);

	public ResponseEntity<?> eliminarCalificacion(Long idCalificacion);

}
