package Mascotas;

import java.util.ArrayList;

public class MascotasTest {
    public static void main(String[] args) {

        Mascota cota = new Mascota("a", 1, "verde");
        Perro perro = new Perro("guau", 3, "marron", 3.5, false);
        Gato gato = new Gato("miau", 16, "blanco", 2.5, 3.2);

        Perro pg = new PerroGrande("pg", 4, "rosa", 5.6, true, PerroGrande.razas.doberman);
        Perro pm = new PerroMediano("pm", 7, "amarillo", 12, false, PerroMediano.razas.galgo);
        Perro pp = new PerroPequeño("pp", 4, "null", 45, true, PerroPequeño.razas.caniche);

        Gato gsp = new GatoSinPelo("gsp", 56, "naranja", 1, 2, GatoSinPelo.razas.elfo);
        Gato gpc = new GatoPeloCorto("gpc", 12, "verde", 2, 0, GatoPeloCorto.razas.britanico);
        Gato gpl = new GatoPeloLargo("gpl", 7, "blamco", 4, 4, GatoPeloLargo.razas.angora);

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        ArrayList<Gato> jatos = new ArrayList<>();
        ArrayList<Perro> peros = new ArrayList<>();

        mascotas.add(cota);
        mascotas.add(perro);
        mascotas.add(gato);
        peros.add(pg);
        peros.add(pm);
        peros.add(pp);
        jatos.add(gsp);
        jatos.add(gpc);
        jatos.add(gpl);

        System.out.println("Las mascotas son: ");
        for (Mascota paco : mascotas) {
            System.out.println(paco);
            System.out.println(paco.sonido());
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("Los perros son: ");
        for (Perro paco : peros) {
            System.out.println(paco);
            System.out.println(paco.sonido());
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("Los gatos son: ");
        for (Gato paco : jatos) {
            System.out.println(paco);
            System.out.println(paco.sonido());
        }
    }
}
