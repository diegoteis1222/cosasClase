package Tarea;

public class Palindromo {
    public boolean esPalindromo(String texto) {
        if (texto == null)
            return false;

        StringBuilder reverso = new StringBuilder(texto).reverse();
        return texto.equalsIgnoreCase(reverso.toString());
    }
}
