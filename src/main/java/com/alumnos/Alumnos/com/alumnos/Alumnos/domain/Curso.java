package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @ManyToOne
    @NotNull
    private Carrera carrera;

    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @NotNull
    @Column(name = "cupo_max")
    private Integer cuporMax;

    @NotNull
    @Column(name = "anio")
    private Integer anio;

    public Curso() {
    }

    public Curso(@NotNull Carrera carrera, @NotNull String nombre, String descripcion, @NotNull Integer cuporMax, @NotNull Integer anio) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cuporMax = cuporMax;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCuporMax() {
        return cuporMax;
    }

    public void setCuporMax(Integer cuporMax) {
        this.cuporMax = cuporMax;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
