package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García", 2008, "55555", 623);
        Revista revista1 = new Revista("Victoria secret", "Victoria", 2005, 5, "Enero");
        Audiovisual audiovisual1 = new Audiovisual("La vaca y el pollito", "Carlos Quiroz", 2000, "Blue-Ray", 20);


        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);
        System.out.println("********************************************");
        System.out.println("Catálogo de Biblioteca:");
        biblioteca.mostrarCatalogo();


        Material buscado = biblioteca.buscarMaterial("La vaca y el pollito");
        if (buscado != null) {
            System.out.println("EL material ha sido encontrado:");
            buscado.mostrarInformacion();
        } else {
            System.out.println("El material no ha sido encontrado.");
        }


        libro1.prestar();
        libro1.devolver();
        libro1.mostrarDetallesLibro();

    }
}