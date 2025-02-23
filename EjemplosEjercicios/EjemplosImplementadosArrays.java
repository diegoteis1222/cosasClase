package GitArchivos.EjemplosEjercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemplosImplementadosArrays {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Mango");
        frutas.add("Banana");
        System.out.println("Despues de add: " + frutas);

        frutas.add(1,"mandarina");
        System.out.println("Despues de add con indice: " + frutas);

        ArrayList<String> temporal = new ArrayList<>(frutas);
        temporal.clear();
        System.out.println("Despues de clear: " + temporal);

        boolean contieneMango = frutas.contains("Mango");
        System.out.println("Hay algun mango?: " + contieneMango);

        String segundafruta = frutas.get(1);
        System.out.println("Segunda fruta: " + segundafruta);

        int indexBanana = frutas.indexOf("Banana");
        System.out.println("Index de Banana: " + indexBanana);

        boolean vacia = frutas.isEmpty();
        System.out.println("Esta vacia? " + vacia);

        String frutaremove = frutas.remove(1);
        System.out.println("Fruta borrada: " + frutaremove);
        System.out.println("Tras borrar: " + frutas);

        boolean manzanaborrar = frutas.remove("Banana");
        System.out.println("Fruta borrada: " + manzanaborrar);
        System.out.println("Tras borrar: " + frutas);

        frutas.add("Uva");
        frutas.add("Pera");
        frutas.removeIf(f -> f.startsWith("P"));
        System.out.println("Tras removeIf: " + frutas);

        frutas.set(0,"Kiwi");
        System.out.println("tras el set: " + frutas);

        int tamaño = frutas.size();
        System.out.println("tamaño de la lista: " + tamaño);

        String[] arrayFrutas  = frutas.toArray(new String[0]);
        System.out.println("arrayFrutas: " + Arrays.toString(arrayFrutas));

    }
}
