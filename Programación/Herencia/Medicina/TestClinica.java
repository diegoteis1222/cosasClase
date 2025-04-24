import java.util.ArrayList;

public class TestClinica {
    public static void main(String[] args) {

        ArrayList<Medico> listaMedicos = new ArrayList<>();

        Medico medico1 = new Medico("Juan Gonzalez");
        listaMedicos.add(medico1);

        Ortopedista ortopedista1 = new Ortopedista("Diego Argüelles", Ortopedista.tipologia.MAXILOFACIAL);
        listaMedicos.add(ortopedista1);

        Pediatra pediatra1 = new Pediatra("Anxo Fonterosa", Pediatra.tipologia.NEUROLOGO);
        listaMedicos.add(pediatra1);

        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico a = (Medico) listaMedicos.get(i);

            if (a instanceof Ortopedista) {
                System.out.println("El objeto en " + i + " es ortopedista");
                continue;
            }
            if (a instanceof Pediatra) {
                System.out.println("El objeto en " + i + " es Pediatra");
                continue;
            }
            if (a instanceof Medico) {
                System.out.println("El objeto en " + i + " es Medico");
                continue;
            }
        }

        System.out.println("Upcasting");

        for (Medico a : listaMedicos) {
            System.out.println(a);
        }
    }
}
