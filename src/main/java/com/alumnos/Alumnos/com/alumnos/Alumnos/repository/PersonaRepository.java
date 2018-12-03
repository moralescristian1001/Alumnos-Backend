package com.alumnos.Alumnos.com.alumnos.Alumnos.repository;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
