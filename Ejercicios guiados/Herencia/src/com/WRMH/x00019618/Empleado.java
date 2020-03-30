package com.WRMH.x00019618;

public class Empleado extends Persona{
    private String workCenter, ID;
    private double salary;

    public Empleado(String firstName, String lastName, String cellphone, String email, int edad, String workCenter, String ID, double salary) {
        super(firstName, lastName, cellphone, email, edad);
        this.workCenter = workCenter;
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public void saludar(){
        System.out.println("El empleado " + firstName + " te esta saludando");
    }
}
