import java.util.Scanner;

public class barras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un codigo: ");
        String codigo = sc.nextLine();

        String[] numeros = codigo.split("");
        int total = 0;

        for (int h = numeros.length - 1; h > 0; h--) {
            int temp = Integer.parseInt(numeros[h]);
            if( temp % 2 != 0) {
                total += temp * 3;
            } else {
                total += temp;
            }

        }

        System.out.println(total);

        sc.close();
    }

}
