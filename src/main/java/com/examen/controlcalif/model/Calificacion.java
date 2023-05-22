package com.examen.controlcalif.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_calificaciones", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_t_calificaciones")
	private Long idCalificacion;

	@ManyToOne
	@JoinColumn(name = "id_t_materias")
	private Materia materia;

	@ManyToOne
	@JoinColumn(name = "id_t_alumnos")
	private Alumno alumno;

	@Column(name = "calificacion")
	private Double calificacion;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

}
