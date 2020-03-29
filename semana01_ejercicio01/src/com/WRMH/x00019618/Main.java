package com.WRMH.x00019618;

public class Main {

    public static void main(String[] args) {
        // Declaraciones de objetos
	    Laptop lap1 = new Laptop("Windows", 8, 500);
	    Laptop lap2 = new Laptop("Asus", "Ubuntu", 8, 1000);

	    Pokemon pkmn1 = new Pokemon("Charmander", 200);
	    Pokemon pkmn2 = new Pokemon("Charizard", "fuego", 350);

	    // Implementacion de interfaz publica (metodos accesibles)
	    lap1.laptopSpecs();
	    lap1.addHDD(500);
		System.out.println();

	    lap2.laptopSpecs();
	    lap2.addHDD(250);
		System.out.println();

	    pkmn1.pkmnData();
	    pkmn1.addHP(20);
		System.out.println();

	    pkmn2.pkmnData();
	    pkmn2.addHP(25);
    }
}
