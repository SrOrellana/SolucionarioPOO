package com.WRMH.x00019618;

public class HerramientasMinecraft {
    // Atributos

    private String nombre, material, uso;
    private int durabilidad, danio;

    // Metodos

    // Constructor
    public HerramientasMinecraft(String nombre, String material, String uso, int durabilidad, int danio) {
        this.nombre = nombre;
        this.material = material;
        this.uso = uso;
        this.durabilidad = durabilidad;
        this.danio = danio;
    }

    public boolean usarHerramienta(){
        System.out.println(nombre + " fue usada para " + uso);
        durabilidad--;

        if(durabilidad <= 0) {
            System.out.println(nombre + " se ha roto");
            return true;
        }
        else
            return false;
    }

    public void repararHerramienta(){
        System.out.println(nombre + " fue reparada parcialmente, +2 durabilidad");
        durabilidad += 2;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "HerramientasMinecraft{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", uso='" + uso + '\'' +
                ", durabilidad=" + durabilidad +
                ", danio=" + danio +
                '}';
    }
}
