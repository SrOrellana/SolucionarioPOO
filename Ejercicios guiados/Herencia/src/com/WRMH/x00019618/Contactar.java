package com.WRMH.x00019618;

public final class Contactar {
    private Contactar() {}

    public static void enviarEmail(String email){
        System.out.println("Enviando email a " + email);
    }

    public static void llamarNumero(String cell){
        System.out.println("Llamando a " + cell);
    }
}
