package com.alumnos.Alumnos.com.alumnos.Alumnos.service.Impl;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.repository.CursoRepository;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.CursoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> cargarTodos(){
        return cursoRepository.findAll();
    }

    public Curso buscarCurso (Integer id) {
        return cursoRepository.findById(id);
    }
}
