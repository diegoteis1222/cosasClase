import java.util.Arrays;

public class nextHappyYear {

    public static int happyYear(int year) {

        // it works, im a noob, pls be gentle

        int next = year + 1;

        while (true) {

            char[] digits = String.valueOf(next).toCharArray();

            Arrays.sort(digits);

            boolean rep = false;

            for (int i = 0; i < digits.length - 1; i++) {
                if (digits[i] == digits[i + 1]) {
                    rep = true;
                    break;
                }
            }

            if (!rep) {
                return next;
            }

            next++;
        }
    }

    public static void main(String[] args) {

        System.out.println(happyYear(2017));

    }
}
