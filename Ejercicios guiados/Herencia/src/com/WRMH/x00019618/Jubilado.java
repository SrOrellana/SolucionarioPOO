package com.WRMH.x00019618;

public class Jubilado extends Persona{
    private double pension;

    public Jubilado(String firstName, String lastName, String cellphone, String email, int edad, double pension) {
        super(firstName, lastName, cellphone, email, edad);
        this.pension = pension;
    }

    @Override
    public void saludar(){
        System.out.println("El jubilado " + firstName + " te esta saludando");
    }
}
