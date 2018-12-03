package com.alumnos.Alumnos.com.alumnos.Alumnos.repository;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    public List<Alumno> findAll();
    public Alumno findById(Integer id);
}
