package com.leosssdroid.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table (name = "EMPLEADO")
public class Empleado implements Serializable{

    private static final long serialVersionUID = 2064339738151493066L;

    @Id
    @Column (name = "COD_EMPLEADO")
    private Long idEmpleado;

    @Column (name = "APELLIDOS")
    private String apellidos;

    @Column (name = "NOMBRE")
    private String nombre;

    @Column (name = "FECHA_NACIMIENTO")
    private LocalDate fechaNacimiento;

    @Column (name = "FECHA_INCORPORACION")
    private LocalDate fechaIncorporacion;

    @Column (name = "DEPARTAMENTO")
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String apellidos, String nombre, LocalDate fechaNacimiento, LocalDate fechaIncorporacion, Departamento departamento) {
        this.idEmpleado = idEmpleado;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIncorporacion = fechaIncorporacion;
        this.departamento = departamento;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaIncorporacion=" + fechaIncorporacion +
                ", departamento=" + departamento.getNombreDep() +
                '}';
    }
}
