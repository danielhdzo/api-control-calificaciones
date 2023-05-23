package com.examen.controlcalif.service;

import java.io.FileNotFoundException;

import org.springframework.http.ResponseEntity;

import com.examen.controlcalif.dto.CalificacionDTO;

import net.sf.jasperreports.engine.JRException;

public interface CalificacionesService {

	public ResponseEntity<?> agregarCalificacion(CalificacionDTO calificacion);

	public ResponseEntity<?> obtenerCalificacionesPorAlumno(Long idAlumno);

	public ResponseEntity<?> actualizarCalificacion(Long idCalificacion, CalificacionDTO calificacionActualizada);

	public ResponseEntity<?> eliminarCalificacion(Long idCalificacion);

	byte[] exportaReportePdf(Long idAlumno) throws JRException, FileNotFoundException;

}
