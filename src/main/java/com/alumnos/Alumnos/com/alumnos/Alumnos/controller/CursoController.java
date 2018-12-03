package com.alumnos.Alumnos.com.alumnos.Alumnos.controller;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Curso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.InscripcionesCurso;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Persona;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.AlumnoService;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.CursoService;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.InscripcionesCursoService;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    private InscripcionesCursoService inscripcionesCursoService;

    @Autowired
    private AlumnoService alumnoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("cursos")
    public ResponseEntity<List<Curso>> cargarTodos(){
        List<Curso> listaCursos = cursoService.cargarTodos();
        return new ResponseEntity<>(listaCursos,  HttpStatus.OK);
    }

    @GetMapping("cursos/{id}")
    public ResponseEntity<List<InscripcionesCurso>> cargarReporte(@PathVariable Integer id){
        List<InscripcionesCurso> listaInscripcionesCurso = inscripcionesCursoService.cargarReporte(id);
        return new ResponseEntity<>(listaInscripcionesCurso,  HttpStatus.OK);
    }

    @GetMapping("cursos/alumno/{id}")
    public ResponseEntity<List<InscripcionesCurso>> cargarCursosAlumno(@PathVariable Integer id){
        List<InscripcionesCurso> listaCursosAlumno = inscripcionesCursoService.cursoPorAlumno(id);
        return new ResponseEntity<>(listaCursosAlumno,  HttpStatus.OK);
    }

    @PostMapping("cursos")
    public ResponseEntity<InscripcionesCurso> crearInscripcionesCurso (@RequestParam String idAlumno, @RequestParam String idCurso) throws URISyntaxException {
        Alumno alumno = alumnoService.cargarAlumnoId(Integer.parseInt(idAlumno));
        Curso curso = cursoService.buscarCurso(Integer.parseInt(idCurso));
        InscripcionesCurso ic = new InscripcionesCurso();
        ic.setAlumno(alumno);
        ic.setCurso(curso);
        ic.setFechaInscripcion(new Date());
        InscripcionesCurso resultado = inscripcionesCursoService.guardar(ic);
        return ResponseEntity.created(new URI("/api/cursos/" + resultado.getCurso().getId())).body(resultado);
    }

}
