package com.example;

public class  Revista extends Material{
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesDePublicacion) {
        super(titulo, autor, añoPublicacion);
        
    }

    @Override
    public void getTipoMaterial() {
        System.out.println("Revista");
    }

    @Override
    public Double calcularTarifaPrestamo(int diasPrestamo) {
        Double tarifaBase = 2.0;
        return tarifaBase * diasPrestamo;
    }
    

    public void mostrarDetallesRevista(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Numero de edicion: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    }
}
