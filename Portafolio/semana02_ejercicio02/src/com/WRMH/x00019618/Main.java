package com.WRMH.x00019618;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Declaracion de Scanner global de la clase
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaracion de listas
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();

        byte op = 0;

        do{
            printMenu(); op = in.nextByte(); in.nextLine();
            System.out.println();

            switch(op){
                case 1:
                    // Verificar que haya datos en la lista (opcional)
                    if(autores.isEmpty())
                        System.out.println("Sin datos aun");
                    else
                        // Impresion con METODO forEach de la clase ArrayList
                        autores.forEach(obj -> System.out.println(obj.toString()));
                    break;
                case 2:
                    // Verificar que haya datos en la lista (opcional)
                    if(libros.isEmpty())
                        System.out.println("Sin datos aun");
                    else
                        // Impresion con for each del lenguaje
                        for(Libro l : libros){ System.out.println(l.toString()); }
                        break;
                case 3:
                    String nombre, email;
                    char genero;

                    System.out.print("Nombre: "); nombre = in.nextLine();
                    System.out.print("Email: "); email = in.nextLine();
                    System.out.print("Genero: "); genero = in.nextLine().charAt(0);

                    // Creacion de objeto tipo autor para agregar en la lista con verificacion (opcional)
                    Autor agregar = new Autor(nombre, email, genero);

                    if(!autores.contains(agregar))
                        autores.add(agregar);
                    else
                        System.out.println("El autor " + nombre + " ya existe en los registros");

                    /*
                        Alternativa sin verificacion
                        autores.add(new Autor(nombre, email, genero));
                     */
                    break;
                case 4:
                    String ISBN, nombreL;
                    int paginas;

                    System.out.print("Nombre: "); nombreL = in.nextLine();
                    System.out.print("Paginas: "); paginas = in.nextLine().charAt(0);

                    // Creacion de objeto tipo autor para agregar en la lista con verificacion (opcional)
                    Libro agregarL = new Libro(nombreL, paginas);

                    if(!libros.contains(agregarL))
                        libros.add(agregarL);
                    else
                        System.out.println("El libro " + nombreL + " ya existe en los registros");

                    /*
                        Alternativa sin verificacion
                        libros.add(new Libro(nombreL, ISBN, paginas));
                     */
                    break;
                case 5:
                    String eliminarA;

                    System.out.print("Nombre del autor: "); eliminarA = in.nextLine();

                    // Eliminar un valor de la lista usando el METODO removeIf de ArrayList
                    // elimina todos los elementos que cumplen la expresion booleana o donde la funcion lambda retorne verdadero
                    autores.removeIf(s-> s.getNombre().equalsIgnoreCase(eliminarA));
                    break;
                case 6:
                    int eliminarL;

                    System.out.print("ISBN: "); eliminarL = in.nextInt();
                    libros.removeIf(s -> s.getISBN() == eliminarL);
                    break;
                case 0:
                    System.out.println("Saliendo . . . ");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while(op != 0);
    }

    static void printMenu(){
        System.out.println("1. Ver autores");
        System.out.println("2. Ver libros");
        System.out.println("3. Agregar autor");
        System.out.println("4. Agregar libro");
        System.out.println("5. Eliminar autor");
        System.out.println("6. Eliminar libro");
        System.out.println("0. Salir");
        System.out.print("Su opcion: ");
    }
}
