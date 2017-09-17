package com.leosssdroid.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DIRECCION")
public class Direccion implements Serializable{

    private static final long serialVersionUID = -1946093442437400640L;

    @Id
    @Column(name = "ID_DIRECCION")
    private Long id;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "LOCALIDAD")
    private String localidad;

    @Column(name = "PROVINCIA")
    private String provincia;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "COD_POSTAL")
    private String codPostal;

    @OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY)
    private Empleado empleado;

    public Direccion() {
    }

    public Direccion(Long id, String direccion, String localidad, String provincia, String pais, String codPostal) {
        this.id = id;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.codPostal = codPostal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", codPostal='" + codPostal + '\'' +
                '}';
    }
}
