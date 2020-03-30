package com.WRMH.x00019618;

public class Persona {
    protected String firstName, lastName, cellphone, email;
    protected int edad;

    public Persona(String firstName, String lastName, String cellphone, String email, int edad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.edad = edad;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void saludar(){
        System.out.println(firstName + " te esta saludando!");
    }
}
