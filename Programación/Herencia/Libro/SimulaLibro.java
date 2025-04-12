package Libro;

import java.util.ArrayList;

public class SimulaLibro {
    public static void main(String[] args) {

        Libro libro1 = new Libro("paco", "paco", 12);

        LibrosTexto libro2 = new LibrosTexto("mates", "paco", 30, "Primaria");

        LibroTextoUni libro3 = new LibroTextoUni("paco", "paco", 12, "Sexto", "Fisica");

        Novela ligera = new Novela("Biblia", "jesus", 666);

        ArrayList<Libro> cole = new ArrayList<Libro>();
        cole.add(libro1);
        cole.add(libro2);
        cole.add(libro3);
        cole.add(ligera);

        for (Libro libro : cole) {
            System.out.println(libro.toString());
        }

    }
}
