package com.alumnos.Alumnos.com.alumnos.Alumnos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;

    @NotNull
    @Column(name = "tipo_doc", nullable = false)
    private String tipoDocumento;

    @NotNull
    @Column(name = "documento", nullable = false)
    private Integer documento;

    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @NotNull
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(@NotNull String tipoDocumento, @NotNull Integer documento, @NotNull String nombre, @NotNull String apellido, @NotNull Date fechaNacimiento) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
