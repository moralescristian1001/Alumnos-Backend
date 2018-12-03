package com.alumnos.Alumnos.com.alumnos.Alumnos.controller;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Persona;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/personas")
    public ResponseEntity<Persona> createAlumno (@Valid @RequestBody Persona persona) throws URISyntaxException {
        Persona resultado = personaService.save(persona);
        return ResponseEntity.created(new URI("/api/alumnos/" + resultado.getId())).body(resultado);
    }
}
