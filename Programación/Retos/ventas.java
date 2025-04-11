import java.util.Arrays;
import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        while (true) {
           
            for (int h = 0; h > dias.length; h++) {
                
                double[] ventas = new double[7];

                System.out.println("Dime cantidad: ");
                ventas[h] = sc.nextDouble();
            }
        }
    }
}