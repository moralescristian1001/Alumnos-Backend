package com.alumnos.Alumnos.com.alumnos.Alumnos.service.Impl;

import com.alumnos.Alumnos.com.alumnos.Alumnos.domain.Persona;
import com.alumnos.Alumnos.com.alumnos.Alumnos.repository.PersonaRepository;
import com.alumnos.Alumnos.com.alumnos.Alumnos.service.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }
}
