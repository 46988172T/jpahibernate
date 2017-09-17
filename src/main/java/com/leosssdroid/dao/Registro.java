package com.leosssdroid.dao;

import com.leosssdroid.Principal;
import com.leosssdroid.modelo.Departamento;
import com.leosssdroid.modelo.Empleado;

import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.List;

public class Registro {
    public static Empleado altaEmpleado(){
        Empleado e = new Empleado(1L, "Martínez Ubal",
                "Leonardo", LocalDate.of(1986,05,24),
                LocalDate.of(2015,02,01), altaDepartamento());
        return e;

    }

    public static Departamento altaDepartamento(){
        Departamento d = new Departamento(1L, "Contabilidad");

        return d;
    }

    public static void getEmpleadosFromBBDD(){
        List<Empleado> todosEmpleados = (List<Empleado>) Principal.em.createQuery("FROM Empleado").getResultList();
        System.out.println("En esta BBDD hay "+todosEmpleados.size()+" empleados.");
        for(Empleado emp : todosEmpleados){
            System.out.println(emp.toString());
        }
    }

    public static void getDepartamentosFromBBDD(){
        List<Departamento> todosDepartamentos = Principal.em.createQuery("FROM Departamento").getResultList();
        System.out.println("En esta BBDD hay "+todosDepartamentos.size()+" departamentos.");
        for(Departamento dep : todosDepartamentos){
            System.out.println(dep.toString());
        }
    }
}
