public class Murciegalo extends Mamifero implements Volador {

    private boolean cuelga = true;

    public Murciegalo(String nombre, boolean cuelga) {
        super(nombre);
        this.cuelga = cuelga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMurciegalo [cuelga=" + cuelga + "]";
    }

    @Override
    public void amamantarCrias() {
        System.out.println("Con mucho cuidado");
    }

    @Override
    public String Volar(String como) {
        return "Los murcielagos vuelan " + como;
    }

}
