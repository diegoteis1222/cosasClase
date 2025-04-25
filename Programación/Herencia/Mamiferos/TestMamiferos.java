public class TestMamiferos {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");

        Ballena mobyDick = new Ballena("mobyDick", 120);

        mobyDick.amamantarCrias();
        System.out.println(mobyDick);

        System.out.println("-------------------------------------------");

        Ornitorrinco perry = new Ornitorrinco("perry", 11);

        perry.amamantarCrias();
        perry.ponerHuevos();
        System.out.println(perry);

        System.out.println("-------------------------------------------");

        Murciegalo paco = new Murciegalo("paco", true);

        paco.amamantarCrias();
        System.out.println(paco.Volar("con cuidado"));
        System.out.println(paco);

        System.out.println("-------------------------------------------");

    }
}
