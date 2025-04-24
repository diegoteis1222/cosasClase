public class Pediatra extends Medico {

    enum tipologia {
        NEUROLOGO, PSICOLOGO
    };

    protected tipologia tipo;

    public Pediatra(String nombre, Pediatra.tipologia tipo) {
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
        return "Pediatra [tipo=" + tipo + "]";
    }

}
