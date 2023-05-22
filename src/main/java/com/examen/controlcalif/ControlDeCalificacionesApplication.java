package com.examen.controlcalif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		scanBasePackages = "com.examen.controlcalif", 
		exclude = { DataSourceAutoConfiguration.class })
public class ControlDeCalificacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlDeCalificacionesApplication.class, args);
	}

}
