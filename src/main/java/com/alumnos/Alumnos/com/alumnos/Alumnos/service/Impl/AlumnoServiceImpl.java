package com.alumnos.Alumnos.com.alumnos.Alumnos.service.Impl;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;
import com.alumnos.Alumnos.com.alumnos.Alumnos.repository.AlumnoRepository;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.AlumnoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> cargarTodos(){
        return alumnoRepository.findAll();
    }

    public Alumno cargarAlumnoId(Integer id){
        return alumnoRepository.findById(id);
    }


}
