package com.examen.controlcalif.service;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.examen.controlcalif.dto.CalificacionDTO;
import com.examen.controlcalif.dto.ResponseExitoDTO;

import net.sf.jasperreports.engine.JRException;

public interface CalificacionesService {

	public ResponseEntity<ResponseExitoDTO> agregarCalificacion(CalificacionDTO calificacion);

	public ResponseEntity<List<Object>> obtenerCalificacionesPorAlumno(Long idAlumno);

	public ResponseEntity<ResponseExitoDTO> actualizarCalificacion(Long idCalificacion, CalificacionDTO calificacionActualizada);

	public ResponseEntity<ResponseExitoDTO> eliminarCalificacion(Long idCalificacion);

	public ResponseEntity<byte[]> exportaReportePdf(Long idAlumno) throws JRException, FileNotFoundException;

}
