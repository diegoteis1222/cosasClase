import java.util.ArrayList;

public class UniversidadTest {

    public static void main(String[] args) {

        Persona paco = new Persona("Paco", "casa");
        Persona juan = new Estudiante("Juan", "casa2", "tonto", 1);
        Persona godolfredo = new Profesor("godolfredo", "casa3", "TuPrima", "Algo");

        ArrayList<Persona> gente = new ArrayList<>();
        gente.add(paco);
        gente.add(juan);
        gente.add(godolfredo);

        System.out.println("Hay esta gente: ");
        for (Persona persona : gente) {
            System.out.println(persona.toString());
            System.out.println(persona.IrClase());
        }

    }

}
