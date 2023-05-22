package com.examen.controlcalif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.controlcalif.model.Calificacion;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
}
