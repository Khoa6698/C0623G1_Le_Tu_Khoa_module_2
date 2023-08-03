package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (checkPrime(number)) {
                System.out.println(number + " is a Prime.");
            } else {
                System.out.println(number + " is not a Prime.");
            }
        }
    }

    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 100) {
            return false;
        }

        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
