public class Ortopedista extends Medico {

    enum tipologia {
        MAXILOFACIAL, PADIATRICA
    };

    protected tipologia tipo;

    public Ortopedista(String nombre, Ortopedista.tipologia tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public tipologia getTipologia() {
        return tipo;
    }

    public void setTipologia(tipologia tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ortopedista [tipo=" + tipo + "]";
    }
    

}
