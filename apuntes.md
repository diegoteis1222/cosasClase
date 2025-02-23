## Apuntes de Arrays java

### Revisar los hashcode y como funcionan las comparaciones
```java
        // Arays
        char[] nombre1 = {'p', 'e', 'p', 'e'};
        char[] nombre2 = {112, 101, 112, 101};
        char[] nombre3 = new char[4];

        String name1 = new String(nombre1); // comvierte el char nombre1 en String
        System.out.println("La cadena 1 es: " + name1);

        String name2 = ""; // crea el string inicializado
        String name3; // crea el string sin inicializar

        for (int i = 0; i < nombre2.length; i++) { // mientras i sea menor que el tamaño de nombre2
            name2 += nombre2[i]; // va sumando los caracteres de nombre2 a name2
        }

        System.out.println("La cadena 2 es: " + name2);

        for (int i = 0; i < nombre3.length; i++) { // mientras i sea menor que el tamaño de nombre3
            System.out.print("--" + nombre3[i] + "--"); // imprime nombre3 pero no tiene contenido
            System.out.println(); // hace que no salgan todos en la misma linea
        }

        System.out.println(name1.equals(name2)); //equals compara los dos strings para ver si son iguales
        System.out.println(nombre1.equals(nombre2)); // pero en los char comprueba su hashcode (creo recordar)
        //no recuerdo bien esto, tengo que revisarlo
        //Todo: revisar esta linea de arriba

        System.out.println(Arrays.equals(nombre1, nombre2));
        // son iguales porque uno escribe la letra y otro apunta al valor en ascii que es esa misma letra

        System.out.println(nombre1.hashCode());
        System.out.println(nombre2.hashCode());
        System.out.println(nombre3.hashCode());
        // los hashcode en los char son diferentes

        name3 = name1;
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        // pero en los string es el mismo porque apunta al mismo sitio de la memoria
        
        //Strings
        String cad1 = "EMMA";
        String cad2 = "MARIA";

        //.compareTo compara los strings por su valor ascii
        System.out.println(cad1.compareTo("emma"));
        System.out.println(cad1.compareTo("EMMA"));
        // "EMMA" usa mayúsculas (ASCII 69), y "emma" usa minúsculas (ASCII 101). 69 - 101 = -32

```

### pequeño ejemplo de strings
```java
        //Strings
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);
        String cad4 = "CHELO";
        String cad5 = "andy";
        String cad6;
        String cad7 = "Emilio";
        String cad8 = " Anaya";

        cad6 = cad5.concat(" y Lucas"); // .concat añade a la derecha lo que queramos 
        
        System.out.println(cad2);
        System.out.println(cad3);
        System.out.println(cad4.length()); // muestra el largo del string
        System.out.println(cad6);
        System.out.println(cad7.toString() + cad8.toString());

        //Strings
        String cad1 = "EMMA";
        String cad2 = "MARIA";

```