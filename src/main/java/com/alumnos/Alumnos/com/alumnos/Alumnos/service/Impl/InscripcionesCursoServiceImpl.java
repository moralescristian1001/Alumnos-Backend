package com.alumnos.Alumnos.com.alumnos.Alumnos.service.Impl;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.InscripcionesCurso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.repository.InscripcionesCursoReposiroty;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.InscripcionesCursoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InscripcionesCursoServiceImpl implements InscripcionesCursoService {

    private final InscripcionesCursoReposiroty inscripcionesCursoReposiroty;

    public InscripcionesCursoServiceImpl(InscripcionesCursoReposiroty inscripcionesCursoReposiroty) {
        this.inscripcionesCursoReposiroty = inscripcionesCursoReposiroty;
    }

    public List<InscripcionesCurso> cargarReporte(Integer id){
        return inscripcionesCursoReposiroty.findAllByCursoId(id);
    }

    public List<InscripcionesCurso> cursoPorAlumno(Integer id){
        return inscripcionesCursoReposiroty.cursoPorAlumno(id);
    }

    public InscripcionesCurso guardar(InscripcionesCurso ic) {
        return inscripcionesCursoReposiroty.save(ic);
    }

}
