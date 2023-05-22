package com.examen.controlcalif.error;

public class AlumnoNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 1L;

	public AlumnoNotFoundException(Long id) {
		super("No se encontró el alumno con el ID especificado: " + id);
	}

}
