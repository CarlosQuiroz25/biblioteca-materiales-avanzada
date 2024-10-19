package com.example;

public class Audiovisual extends Material {
    private String formato;
    private int duracion;

    public Audiovisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion);
        
    }

    @Override
    public void getTipoMaterial() {
        System.out.println("Audiovisual");
    }

    @Override
    public Double calcularTarifaPrestamo(int diasPrestamo) {
        Double tarifaBase = 3.0;
        if (formato == "Blu-Ray") {
            tarifaBase += 0.5;
        }
        return tarifaBase * diasPrestamo;
    }
    
    public void mostrarDetallesAudiovisual(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion);
    }

}
