package com.examen.controlcalif.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalificacionDTO {

	private Long id;
	
	@Min(value = 1)
	private Long idMateria;
	
	@Min(value = 1)
	private Long idAlumno;
	
	@Min(value = 0)
    @Max(value = 10)
    @NotNull
	private Double calificacion;
    
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private String fechaRegistro;

}
