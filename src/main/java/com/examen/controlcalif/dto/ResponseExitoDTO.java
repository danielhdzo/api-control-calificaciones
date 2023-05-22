package com.examen.controlcalif.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseExitoDTO {

	public ResponseExitoDTO(String msg) {
		super();
		this.success = "ok";
		this.msg = msg;
	}

	private String success;
	private String msg;

}
