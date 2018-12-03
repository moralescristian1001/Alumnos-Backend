package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inscripciones_curso")
public class InscripcionesCurso implements Serializable {

    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @NotNull
    @ManyToOne
    private Alumno alumno;

    @NotNull
    @ManyToOne
    private Curso curso;

    @NotNull
    @Column(name = "fecha_inscripcion", nullable = false)
    private Date fechaInscripcion;

    public InscripcionesCurso() {
    }

    public InscripcionesCurso(@NotNull Alumno alumno, @NotNull Curso curso, @NotNull Date fechaInscripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
