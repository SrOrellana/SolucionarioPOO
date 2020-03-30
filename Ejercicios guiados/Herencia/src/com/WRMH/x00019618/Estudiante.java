package com.WRMH.x00019618;

public class Estudiante extends Persona{
    private String college, carnet;

    public Estudiante(String firstName, String lastName, String cellphone, String email, int edad, String college, String carnet) {
        super(firstName, lastName, cellphone, email, edad);
        this.college = college;
        this.carnet = carnet;
    }

    @Override
    public void saludar(){
        System.out.println("El estudiante " + firstName + " te esta saludando");
    }
}
