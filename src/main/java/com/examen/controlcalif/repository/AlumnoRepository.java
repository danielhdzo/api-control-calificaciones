package com.examen.controlcalif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.controlcalif.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
