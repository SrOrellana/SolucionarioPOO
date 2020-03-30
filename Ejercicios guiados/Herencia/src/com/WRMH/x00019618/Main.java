package com.WRMH.x00019618;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> p = new ArrayList<>();

        p.add(new Empleado("Walter", "Rafael", "71320261", "3dfwas@gmail.com",
                20, "UCA", "00019618", 300.00));
        p.add(new Estudiante("Juan", "Rafael", "2312312", "asfas@gmail.com",
                20, "UCA", "00019618"));
        p.add(new Jubilado("Pedro", "Rafael", "42321312", "afasfas@gmail.com",
                60, 450.00));
        p.add(new Empleado("Xiomara", "Rafael", "87654", "afsafa@gmail.com",
                20, "UCA", "00019618", 300.00));

        p.forEach(obj -> {
            if(obj instanceof Empleado){
                Contactar.enviarEmail(obj.getEmail());
                Contactar.llamarNumero(obj.getCellphone());
                System.out.println();
            }
        });
    }
}
