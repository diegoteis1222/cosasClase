## Apuntes de Arrays java

### Convertir un numero en un array
``` java
        //Obtener cadena de numeros
        System.out.println("Dame un numero para ordenarlo: ");
        String caracter = sc.nextLine();

        //convierte en array el numero
        char[] partes = caracter.toCharArray();
        System.out.println(Arrays.toString(partes));

        // Ordena el array numericamente
        Arrays.sort(partes);
        System.out.println(Arrays.toString(partes));

        //Reconstruye el numero desde el array ordenado
        String modificada = Arrays.toString(partes);
        System.out.println(modificada);

        //Quita los corchetes y las comas
        String modificada2 = String.valueOf(partes);
        System.out.println(modificada2);

        //Elimina los espacios si los hay
        String sinEspacios = modificada2.trim();
        System.out.println(sinEspacios);
```