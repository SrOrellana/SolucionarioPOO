package com.WRMH.x00019618;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<HerramientasMinecraft> h = new ArrayList<>();
        byte op = 0;
        String nombre, material, uso;
        int durabilidad, danio;

        do{
            printMenu(); op = in.nextByte(); in.nextLine();
            System.out.println();

            switch(op){
                case 1:
                    System.out.print("Nombre: "); nombre = in.nextLine();
                    System.out.print("Material: "); material = in.nextLine();
                    System.out.print("Uso: "); uso = in.nextLine();
                    System.out.print("Durabilidad: "); durabilidad = in.nextInt(); in.nextLine();
                    System.out.print("Danio: "); danio = in.nextInt(); in.nextLine();

                    h.add(new HerramientasMinecraft(nombre, material, uso, durabilidad, danio));
                    break;
                case 2:
                    h.forEach(obj -> System.out.println(obj.toString()));
                    break;
                case 3:
                    System.out.print("Material: "); material = in.nextLine();

                    for(HerramientasMinecraft o : h){
                        if(o.getMaterial().equalsIgnoreCase(material))
                            System.out.println(o.toString());
                    }
                    break;
                case 4:
                    h.removeIf(obj -> obj.usarHerramienta());
                    break;
                case 5:
                    h.forEach(obj -> obj.repararHerramienta());
                    break;
                case 0:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Opcion invalida . . . ");
            }
            System.out.println();
        } while(op != 0);
    }

    static void printMenu(){
        System.out.println("1. Agregar herramienta");
        System.out.println("2. Consultar herramientas");
        System.out.println("3. Consultar herramientas por tipo");
        System.out.println("4. Usar herramientas");
        System.out.println("5. Reparar herramientas");
        System.out.println("0. Salir");
        System.out.print("Su opcion: ");
    }
}
