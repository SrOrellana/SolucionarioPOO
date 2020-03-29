package com.WRMH.x00019618;

public class Libro {
    private String nombre;
    private int paginas, ISBN;

    public Libro(String nombre, int paginas) {
        // Generando ISBN a traves de clase estatica
        this.ISBN = GeneradorISBN.nuevoISBN();
        this.nombre = nombre;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
