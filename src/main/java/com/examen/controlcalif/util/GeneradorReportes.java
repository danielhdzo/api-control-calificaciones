package com.examen.controlcalif.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Component
public class GeneradorReportes {

	public byte[] exportToPdf(String nomReporte, Map<String, Object> params) throws JRException, FileNotFoundException {
		return JasperExportManager.exportReportToPdf(getReporte(nomReporte, params));
	}

	private JasperPrint getReporte(String nomReporte, Map<String, Object> params)
			throws FileNotFoundException, JRException {

		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(
					JasperCompileManager.compileReport(ResourceUtils.getURL("classpath:" + nomReporte).openStream()),
					params, new JREmptyDataSource());
		} catch (JRException | IOException e) {
			e.printStackTrace();
		}

		return jasperPrint;
	}
}
