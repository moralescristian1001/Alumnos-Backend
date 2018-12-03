package com.alumnos.Alumnos.com.alumnos.Alumnos.service;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoService {

    Alumno guardar(Alumno alumno);

    List<Alumno> cargarTodos();

    Alumno cargarAlumnoId(Integer id);

}
