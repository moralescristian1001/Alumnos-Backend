package com.alumnos.Alumnos.com.alumnos.Alumnos.repository;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    public Curso findById(Integer id);
}
