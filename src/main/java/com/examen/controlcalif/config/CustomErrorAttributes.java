package com.examen.controlcalif.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.examen.controlcalif.util.Constantes;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CustomErrorAttributes extends DefaultErrorAttributes {

	private static final String TIMESTAMP = "timestamp";
	
	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
		DateFormat dateFormat = new SimpleDateFormat(Constantes.PATRON_FECHA_HORA);
		// Dejamos que Spring maneje el error primero, y lo modifico despues
		Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);

		// Quitamos la Traza del Error
		errorAttributes.remove("trace");

		// Formatea timestamp
		Object timestamp = errorAttributes.get(TIMESTAMP);
		if (timestamp == null) {
			errorAttributes.put(TIMESTAMP, dateFormat.format(new Date()));
		} else {
			errorAttributes.put(TIMESTAMP, dateFormat.format((Date) timestamp));
		}

		return errorAttributes;
	}

}
