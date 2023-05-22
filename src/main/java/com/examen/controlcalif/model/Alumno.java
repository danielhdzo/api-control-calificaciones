package com.examen.controlcalif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_alumnos", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_t_alumnos")
    private Long idAlumno;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ap_paterno")
    private String apellidoPaterno;

    @Column(name = "ap_materno")
    private String apellidoMaterno;

    @Column(name = "activo")
    private Integer activo;

}
