import java.util.ArrayList;

public class UniversidadTest {

    public static void main(String[] args) {

        Persona paco = new Persona("Paco", "casa");
        Estudiante juan = new Estudiante("Juan", "casa2", "tonto", 1);
        Profesor godolfredo = new Profesor("godolfredo", "casa3", "TuPrima", "Algo");
        ProfesorTitular pepe = new ProfesorTitular("pepe", "casa4", "TuAbuela", "si", "mates");

        ArrayList<Persona> gente = new ArrayList<>();
        gente.add(paco);
        gente.add(juan);
        gente.add(godolfredo);
        gente.add(pepe);

        System.out.println("Hay esta gente: ");
        for (Persona persona : gente) {
            if (persona instanceof Profesor) {
                System.out.println(persona.toString());
                System.out.println(persona.IrClase());
            } else {
                System.out.println("No es un profesor");
            }
        }

        Profesor profe2 = pepe;
        System.out.println(pepe.toString());
        System.out.println(profe2.toString());

    }

}
