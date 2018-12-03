package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inscripciones_carrera")
public class InscripcionesCarrera implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @NotNull
    @ManyToOne
    private Alumno alumno;

    @NotNull
    @ManyToOne
    private Carrera carrera;

    @NotNull
    @Column(name = "fecha_inscripcion", nullable = false)
    private Date fechaInscripcion;

    public InscripcionesCarrera() {
    }

    public InscripcionesCarrera(@NotNull Alumno alumno, @NotNull Carrera carrera, @NotNull Date fechaInscripcion) {
        this.alumno = alumno;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
