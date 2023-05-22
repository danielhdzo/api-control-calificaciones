package com.examen.controlcalif.error;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String string) {
		super(string);
	}

}
