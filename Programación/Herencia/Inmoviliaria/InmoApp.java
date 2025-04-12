package Inmoviliaria;

import java.util.ArrayList;

import Inmoviliaria.Local.tipo;

public class InmoApp {
    public static void main(String[] args) {

        CasaRural casa1 = new CasaRural(1, 50, "a 1", 3, 2, 3, 1, 1);
        CasaCerrado casa2 = new CasaCerrado(2, 100, "b 33", 4, 2, 1, 1000, false, false);
        CasaIndependiente casa3 = new CasaIndependiente(3, 150, "c 44", 5, 3, 2);
        ApartamentoFamiliar apar1 = new ApartamentoFamiliar(4, 30, "f 3", 2, 1, 100);
        Apartaestudio apar2 = new Apartaestudio(6, 10, "g 5", 1, 1);
        LocalComercial local1 = new LocalComercial(8, 50, "cd 3", tipo.CALLE, "Calle xz");
        Oficina local2 = new Oficina(11, 30, "segundoP", tipo.INTERNO, false);

        ArrayList<Inmueble> inmo = new ArrayList<Inmueble>();
        inmo.add(casa1);
        inmo.add(casa2);
        inmo.add(casa3);
        inmo.add(apar1);
        inmo.add(apar2);
        inmo.add(local1);
        inmo.add(local2);

        double suma = 0d;

        for (Inmueble i : inmo) {
            i.pueblaValores();
            i.calcularPrecioVenta();
            suma += i.getPrecioVenta();
            System.out.println(i.toString() + "\n --->" + i.getPrecioVenta());
        }

        System.out.println("Total valor propiedades inmobiliaria: " + "\n---> " + suma);

    }

}
