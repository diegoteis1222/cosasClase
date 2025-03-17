package Discos;

import java.io.Serializable;

public class Diego implements Serializable { // No olvidarse del implements en ambos lados

    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Diego(String codigo, String autor, String titulo, String genero, int duracion) {
        super();
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String cadena="\n-----------------------------------";
        cadena+="\nCodigo: "+this.codigo;
        cadena+="\nAutor: "+this.autor;
        cadena+="\nTitulo: "+this.titulo;
        cadena+="\nGenero: "+this.genero;
        cadena+="\nDuracion: "+this.duracion;
        cadena+="\n-----------------------------------------";
        return cadena;
        }

}
