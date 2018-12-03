package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @OneToOne
    @NotNull
    private Persona persona;

    @NotNull
    @Column(name = "legajo", nullable = false)
    private Integer legajo;

    public Alumno() {
    }

    public Alumno(@NotNull Persona persona, @NotNull Integer legajo) {
        this.persona = persona;
        this.legajo = legajo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
