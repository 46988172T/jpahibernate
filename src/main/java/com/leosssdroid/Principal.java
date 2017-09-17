package com.leosssdroid;

import com.leosssdroid.dao.Registro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemplo");
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        em.getTransaction().begin();
        em.persist(Registro.altaDepartamento());
        em.persist(Registro.altaEmpleado());
        em.getTransaction().commit();
        Registro.getEmpleadosFromBBDD();
        Registro.getDepartamentosFromBBDD();

    }
}
