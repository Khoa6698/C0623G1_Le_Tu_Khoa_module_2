package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            } else {
               continue;
            }
        }
    }


    static boolean checkPrime(int n) {
        if (n < 2) {
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
