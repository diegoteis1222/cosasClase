public class Ballena extends Mamifero {

    private double peso;

    public Ballena(String nombre, double peso) {
        super(nombre);
        this.peso = peso;
    }

    @Override
    public void amamantarCrias() {
        System.out.println("Amamanta sus crias en los mares lol xd");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBallena [peso=" + peso + "]";
    }
}
