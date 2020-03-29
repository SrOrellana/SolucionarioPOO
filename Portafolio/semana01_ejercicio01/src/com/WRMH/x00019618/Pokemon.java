package com.WRMH.x00019618;

// Clase libre
public class Pokemon {
    // ------------------------ Atributos ----------------------------
    private String name, type;
    private int hp;


    // ------------------------ Metodos ------------------------------

    // Primera sobrecarga
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        type = "???";
    }

    // Segunda sobrecarga
    public Pokemon(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    // Primer metodo
    public void pkmnData(){
        System.out.println("Pokemon " + name + ", tipo: " + type + ", HP: " + hp);
    }

    public void addHP(int addHP){
        hp += addHP;
        System.out.println(name + " ahora tiene " + hp + " hp");
    }
}
