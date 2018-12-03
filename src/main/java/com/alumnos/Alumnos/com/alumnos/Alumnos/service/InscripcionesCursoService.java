package com.alumnos.Alumnos.com.alumnos.Alumnos.service;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.InscripcionesCurso;

import java.util.List;

public interface InscripcionesCursoService {

    List<InscripcionesCurso> cargarReporte(Integer id);

    List<InscripcionesCurso> cursoPorAlumno(Integer id);

    InscripcionesCurso guardar(InscripcionesCurso ic);
}
