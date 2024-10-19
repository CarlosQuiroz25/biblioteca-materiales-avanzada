package com.example;

public abstract class Material {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected boolean disponible = true;

    public Material(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }

    public void prestar(){
        disponible = false;
    }
    public void devolver(){
        disponible = true;
    }

    public abstract void getTipoMaterial();
    public abstract Double calcularTarifaPrestamo(int diasPrestamo);

}
