package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "carrera")
public class Carrera implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @NotNull
    @Column(name = "fecha_desde", nullable = false)
    private Date fechaDesde;

    @Column(name = "fecha_hasta")
    private Date fechaHasta;

    public Carrera() {
    }

    public Carrera(@NotNull String nombre, String descripcion, @NotNull Date fechaDesde, Date fechaHasta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
