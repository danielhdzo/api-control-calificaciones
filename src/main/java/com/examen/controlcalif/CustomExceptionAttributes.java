package com.examen.controlcalif;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.examen.controlcalif.util.Constantes;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CustomExceptionAttributes {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.PATRON_FECHA_HORA)
	private LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;

}
