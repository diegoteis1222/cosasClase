package Libro;

public class LibrosTexto extends Libro{
    protected String curso;

    public LibrosTexto(String titulo, String autor, float precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibrosTexto [titulo=" + titulo + ", curso=" + curso + ", autor=" + autor + ", precio=" + precio + "]";
    }
    
}
