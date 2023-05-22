package com.examen.controlcalif.error;

public class CalificacionesNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 1L;

	public CalificacionesNotFoundException() {
		super("Calificaciones no encontradas.");
	}

}
