package com.WRMH.x00019618;

// Los nombres de las clases siempre inician en mayuscula
public class Laptop {
    // ------------------------ Atributos ----------------------------
    private String brand, SO;
    private int ram, HDD;


    // ------------------------ Metodos ------------------------------

    // Constructor, primera sobrecarga
    public Laptop(String SO, int ram, int HDD) {
        this.SO = SO;
        this.ram = ram;
        this.HDD = HDD;

        // Si el valor de un atributo no se recibe como parametro, debe inicializarse en algun valor por defecto
        brand = "Sin marca";
    }

    // Constructor, segunda sobrecarga
    public Laptop(String brand, String SO, int ram, int HDD) {
        this.brand = brand;
        this.SO = SO;
        this.ram = ram;
        this.HDD = HDD;
    }

    // Primer metodo
    public void laptopSpecs(){
        System.out.println("Laptop marca: " + brand + ", SO: " + SO + ", ram: " + ram + ", HDD: " + HDD);
    }

    // Segundo metodo
    public void addHDD(int add){
        HDD += add;
        System.out.println("La laptop ahora cuenta con " + HDD + " GB de disco duro");
    }
}
