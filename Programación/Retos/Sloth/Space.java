package Sloth;

import java.util.Arrays;
import java.util.Scanner;

public class Space {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Message: ");
        String mg = sc.nextLine();

        String[] encrypted = mg.split("");

        System.out.println(Arrays.toString(encrypted));

        for (String word: encrypted) {
            if (word == "[") {
                
            }
        }

        String decrypted = Arrays.toString(encrypted);

        System.out.println(decrypted);
        sc.close();
    }

}
