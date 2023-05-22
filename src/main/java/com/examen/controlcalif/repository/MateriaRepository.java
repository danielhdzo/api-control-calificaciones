package com.examen.controlcalif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.controlcalif.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
