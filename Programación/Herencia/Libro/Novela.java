package Libro;
public class Novela extends Libro {
    enum tipo{
        HISTORICA,ROMANTICA,POLICIACA,REALISTA,CIENCIA_FINCCION,AVENTURA
    }

    private tipo tipoNovela;

    public Novela(String titulo, String autor, float precio) {
        super(titulo, autor, precio);
        this.tipoNovela = tipo.HISTORICA;
    }

    public tipo getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(tipo tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public String toString() {
        return "Novela [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", tipoNovela=" + tipoNovela
                + "]";
    }


}