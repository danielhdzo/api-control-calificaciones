package com.examen.controlcalif.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseCalificacionDTO {

	private Long idAlumno;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String materia;
	private Double calificacion;
	private String fechaRegistro;

}
