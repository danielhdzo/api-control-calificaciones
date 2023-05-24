package com.examen.controlcalif.config;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.examen.controlcalif.error.NotFoundException;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private CustomExceptionAttributes customExceptionAttributes;

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<CustomExceptionAttributes> springHandleAlumnoNotFound(HttpServletResponse response,
			Exception ex, WebRequest request) {
		customExceptionAttributes.setTimestamp(LocalDateTime.now());
		customExceptionAttributes.setStatus(HttpStatus.NOT_FOUND.value());
		customExceptionAttributes.setError(HttpStatus.NOT_FOUND.name());
		customExceptionAttributes.setMessage(ex.getMessage());

		return new ResponseEntity<>(customExceptionAttributes, HttpStatus.NOT_FOUND);
	}
	
    @ExceptionHandler(ConstraintViolationException.class)
    public void constraintViolationException(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

}
