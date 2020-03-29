package com.WRMH.x00019618;

// Declaracion de clase, final para que sea estatica
public final class GeneradorISBN {

    // Atributo estatico de la clase
    private static int contador = 0;

    // Constructor privado (porque es esatica la clase)
    private GeneradorISBN() {}

    // Metodo estatico para generar un ISBN
    public static int nuevoISBN(){
        return ++contador;
    }
}