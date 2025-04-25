public class Ornitorrinco extends Mamifero implements Oviparo {

    private int numCrias;

    public Ornitorrinco(String nombre, int numCrias) {
        super(nombre);
        this.numCrias = numCrias;
    }

    @Override
    public void amamantarCrias() {
        System.out.println("Sudan lechita");

    }

    @Override
    public String toString() {
        return super.toString() + "\nOrnitorrinco [numCreias=" + numCrias + "]";
    }

    @Override
    public void ponerHuevos() {
        System.out.println("Ponen huevos cantando algo de mister Jagger");
    }
}
