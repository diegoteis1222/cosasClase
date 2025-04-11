package Libro;

import Inmoviliaria.Inmueble;

public class LibroTextoUni extends LibrosTexto {

    private String facultad;

    public LibroTextoUni(String titulo, String autor, float precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUni [titulo=" + titulo + ", curso=" + curso + ", facultad=" + facultad + ", autor=" + autor
                + ", precio=" + precio + "]";
    }


}
