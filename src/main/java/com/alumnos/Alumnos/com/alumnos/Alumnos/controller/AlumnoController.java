package com.alumnos.Alumnos.com.alumnos.Alumnos.controller;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Alumno;
import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Persona;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.AlumnoService;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AlumnoController {

    private final AlumnoService alumnoService;

    @Autowired
    private PersonaService personaService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/alumnos")
    public ResponseEntity<List<Alumno>> cargarTodos(){
        List<Alumno> listaAlumnos = alumnoService.cargarTodos();
        return new ResponseEntity<>(listaAlumnos,  HttpStatus.OK);
    }

    @GetMapping("/alumnos/{id}")
    public ResponseEntity<Alumno> cargarAlumnoId(@PathVariable Integer id) {
        Alumno alumno = alumnoService.cargarAlumnoId(id);
        return ResponseEntity.ok(alumno);
    }

    @PostMapping("/alumnos")
    public ResponseEntity<Alumno> crearAlumno (@RequestBody Alumno alumno) throws URISyntaxException {
        Persona persona = personaService.save(alumno.getPersona());
        alumno.setPersona(persona);
        Alumno resultado = alumnoService.guardar(alumno);
        return ResponseEntity.created(new URI("/api/alumnos/" + resultado.getId())).body(resultado);
    }

    @PutMapping("/alumnos")
    public ResponseEntity<Alumno> actualizarAlumno (@RequestBody Alumno alumno) throws URISyntaxException {
        Persona persona = personaService.save(alumno.getPersona());
        alumno.setPersona(persona);
        Alumno resultado = alumnoService.guardar(alumno);
        return ResponseEntity.created(new URI("/api/alumnos/" + resultado.getId())).body(resultado);
    }
}
