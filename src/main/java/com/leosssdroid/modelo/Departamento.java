package com.leosssdroid.modelo;


import javafx.scene.chart.XYChart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable{

    @Id
    @Column(name ="ID_DEP")
    private Long idDep;

    @Column(name ="NOMBRE_DEP")
    private String nombreDep;

    public Departamento() {
    }

    public Departamento(Long idDep, String nombreDep) {
        this.idDep = idDep;
        this.nombreDep = nombreDep;
    }

    public Long getIdDep() {
        return idDep;
    }

    public void setIdDep(Long idDep) {
        this.idDep = idDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "idDep=" + idDep +
                ", nombreDep='" + nombreDep + '\'' +
                '}';
    }
}
