import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Lobo lobo = new Lobo();
        Leon leon = new Leon();

        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(perro);
        animales.add(gato);
        animales.add(lobo);
        animales.add(leon);

        for (Animal a : animales) {
            System.out.println(a);
            // System.out.println(a.getNombreCientifico() + " " + a.getHabitat() + " " + a.getSonido() + " " + a.getAlimentos());
        }
    }
}
