package Discos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class testDiego implements Serializable { // No olvidarse del implements en ambos lados

    static ArrayList<Diego> discos;
    static Scanner sc = new Scanner(System.in);

    public static void crearColeccion() {
        discos = new ArrayList<Diego>();
    }

    // mock de datos
    public static void iniciaColeccion() {
        discos.add(new Diego("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Diego("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        discos.add(new Diego("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
    }

    public static void mostrarColeccion() {
        for (Diego d : discos) { //Por cada disco
            if (d != null) { //Si el disco no es igual a null
                System.out.println(d.toString()); //Lo muestra por pantalla
            }
        }
    }

    private static void pideDisco() {

        System.out.println("Introduzca los datos del disco: ");

        sc.nextLine(); // Limpia la memoria del scanner, recomiendo ponerlo si se salta algun imput

		System.out.print("Código: ");
		String codigoIn = sc.nextLine();

        System.out.print("Autor: ");
        String autorIn = sc.nextLine();

        System.out.print("Título: ");
        String tituloIn = sc.nextLine();

        System.out.print("Género: ");
        String generoIn = sc.nextLine();

        System.out.print("Duración: ");
        int duracionIn = Integer.parseInt(sc.nextLine());

        System.out.println("Seguro que quieres crear este disco?\ns/n");
        int res = sc.nextLine().charAt(0);
        if (res == 's') {
            discos.add(new Diego(codigoIn, autorIn, tituloIn, generoIn, duracionIn));
            System.out.println("DISCO CREADO CON EXITO...");
        }
    }

    public static void borrarDisco() {

        boolean esta = false;

        System.out.println("Introduce Codigo de disco para borrar");
        sc.nextLine();

        System.out.println("Codigo:");
        String codigoIn = sc.nextLine(); 

        // metodo busqueda
        for (Diego dis : discos) { // por cada disco
            if (dis.getCodigo().equals(codigoIn)) { //Si el codigo de algun disco es igual al que le dimos
                System.out.println("Disco encontrado...");
                System.out.println(dis.toString()); //Lo muestra por pantalla
                esta = true; // cambia el booleano a true
            }
            if (esta == true) {
                System.out.println("Quieres borrar ese disco? 1:SI 2:NO");
                int decision = sc.nextInt();

                if (decision == 1) {
                    if (dis != null) {
                        discos.remove(dis);
                        System.out.println("Disco borrao...");
                        return;
                    }
                }
            }
            // fin decision
        } // fin for
        return;
    }

    public static void modificarDisco() {

        boolean esta = false;
        System.out.println("Introduce Codigo de disco para borrar");
        sc.nextLine();
        System.out.println("Codigo:");
        String codigoIn = sc.nextLine();

        // metodo busqueda
        for (Diego dis : discos) {
            if (dis.getCodigo().equals(codigoIn)) {
                System.out.println("DISCO ENCONTRADO...");
                System.out.println(dis.toString());
                esta = true;
            }
            if(esta==false) {
                System.out.println("DISCO NO ENCONTRADO...");
            }
            if (esta == true) {

                System.out.println("Seguro que quieres modificar este disco?\ns/n");
                int res = sc.nextLine().charAt(0);
                if (res == 's') {
                    System.out.println("Por favor, introduzca los nuevos datos del disco.");
                    System.out.print("Código: ");
                    dis.setCodigo(sc.nextLine());
                    // habria q ver si no repetimos codigo
                    System.out.print("Autor: ");
                    dis.setAutor(sc.nextLine());
                    System.out.print("Título: ");
                    dis.setTitulo(sc.nextLine());
                    ;
                    System.out.print("Género: ");
                    dis.setGenero(sc.nextLine());
                    System.out.print("Duración: ");
                    dis.setDuracion(Integer.parseInt(sc.nextLine()));
                    System.out.println("\nDISCO MODIFICADO CON EXITO...");
                }

                return;

            }
        }
    }

    private static void guardarColeccion() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("misDiscos.bin"))) {

            oos.writeObject(discos);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void cargarColeccion() throws ClassNotFoundException  {
        //recuperar array list de
        try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("misDiscos.bin"))){
            discos=(ArrayList<Diego>) ois.readObject();
            System.out.println("Coleccion de discos recuperada");
            for(Diego elem:discos) {
                System.out.println(elem);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {

        crearColeccion();
        iniciaColeccion();
        mostrarColeccion();

        int opcion = 0;

        do {
            System.out.println("\n Colecion de discos");
            System.out.println("====================================");
            System.out.println("1. Mostrar coleccion");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar disco");
            System.out.println("4. Borrar disco");
            System.out.println("5. Guardar coleccion");
            System.out.println("6. Cargar coleccion");
            System.out.println("7. Salir\n");

            System.out.println("Introduzca opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrar coleccion");
                    System.out.println("====================");

                    mostrarColeccion();

                    break;
                case 2:
                    System.out.println("Nuevo disco");
                    System.out.println("====================");

                    pideDisco();

                    break;
                case 3:
                    System.out.println("Modificar disco");
                    System.out.println("====================");

                    modificarDisco();

                    break;
                case 4:
                    System.out.println("Borrar disco");
                    System.out.println("====================");

                    borrarDisco();

                    break;
                case 5:
                    System.out.println("guardar coleccion");
                    System.out.println("====================");

                    guardarColeccion();

                    break;
                case 6:
                    System.out.println("Cargar coleccion");
                    System.out.println("====================");

                    cargarColeccion();
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 7);

    }
}
