package com.alumnos.Alumnos.com.alumnos.Alumnos.repository;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.InscripcionesCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface InscripcionesCursoReposiroty extends JpaRepository<InscripcionesCurso, Long> {
    @Query("SELECT ic FROM InscripcionesCurso ic WHERE ic.curso.id IN (:id)")
    List<InscripcionesCurso> findAllByCursoId(@Param("id") Integer id);

    @Query("SELECT ic.curso FROM InscripcionesCurso ic WHERE ic.alumno.id = (:id)")
    List<InscripcionesCurso> cursoPorAlumno (@Param("id") Integer id);
}
