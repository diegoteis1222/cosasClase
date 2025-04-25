public abstract class Mamifero {

    protected String nombre;

    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mamifero [nombre=" + nombre + "]";
    }

    public abstract void amamantarCrias();

}