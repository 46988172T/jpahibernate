package com.leosssdroid.dao;

import com.leosssdroid.Principal;
import com.leosssdroid.modelo.Departamento;
import com.leosssdroid.modelo.Direccion;
import com.leosssdroid.modelo.Empleado;
import java.time.LocalDate;
import java.util.List;

public class Registro {
    public static Empleado altaEmpleado(){

        Empleado e = new Empleado(1L, "Martínez Ubal",
                "Leonardo", LocalDate.of(1986,05,24),
                LocalDate.of(2015,02,01), new Departamento(1L, "Contabilidad"),
                new Direccion(1L, "Calle de las Acacias 24, 4-2", "Barcelona", "Barcelona", "España", "08011"));
        return e;
    }


    public static void getEmpleadosFromBBDD(){
        List<Empleado> todosEmpleados = (List<Empleado>) Principal.em.createQuery("FROM Empleado").getResultList();
        System.out.println("En esta BBDD hay "+todosEmpleados.size()+" empleados.");
        for(Empleado emp : todosEmpleados){
            System.out.println(emp.toString());
        }
    }

}
