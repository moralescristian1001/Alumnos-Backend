package com.alumnos.Alumnos.com.alumnos.Alumnos.service;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso> cargarTodos();

    Curso buscarCurso(Integer id);
}
