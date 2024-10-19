package com.example;

public class Libro extends Material {
    private String isbn;
    private int numeroDePaginas;


    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroDePaginas) {
        super(titulo, autor, añoPublicacion);
    }

    @Override
    public void getTipoMaterial() {
        System.out.println("Libro");
    }

    @Override
    public Double calcularTarifaPrestamo(int diasPrestamo) {
        Double tarifaBase = 1.0;
        if (numeroDePaginas > 500) {
            tarifaBase += 0.5;
        }
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Isbn: " + isbn);
        System.out.println("Numero de páginas: " + numeroDePaginas);
    }



}
