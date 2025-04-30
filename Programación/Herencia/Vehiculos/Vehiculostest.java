public class Vehiculostest {

    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(100, 500);

        System.out.println("Terreste --> Camioneta");
        System.out.println(camioneta);

        camioneta.acelerar(50);

        System.out.println("Tras actualizar");
        System.out.println(camioneta);

        Acuatico motoAcutica = new Acuatico(50, 110);

        System.out.println("Acuatico --> motoAcuatica");
        System.out.println(motoAcutica);

        System.out.println("Revoluciones del motor = " + motoAcutica.CalcularRevoluciones(1200, 2));

        motoAcutica.recomendarVelocidad(20);
        System.out.println(motoAcutica);

        Aereo avion = new Aereo(500, 1000);

        System.out.println("Aereo --> avion");
        System.out.println(avion);

        avion.acelerar(400);
        avion.despegar();
        avion.volar();
        avion.aterrizar();

        System.out.println(avion.CalcularRevoluciones(1000, 5));
        avion.frenar(800);
        System.out.println(avion);

        System.out.println(avion.encender("ACME"));
        System.out.println(avion.apagar("ACME"));

    }

}
