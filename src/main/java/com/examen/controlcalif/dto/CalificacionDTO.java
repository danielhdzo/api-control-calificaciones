package com.examen.controlcalif.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalificacionDTO {

	private Long id;
	private Long idMateria;
	private Long idAlumno;
	private Double calificacion;
	private String fechaRegistro;

}
