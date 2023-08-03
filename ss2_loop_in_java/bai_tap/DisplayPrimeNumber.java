package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int status = 1;
        int number = 3;
        System.out.println("20 number prime: ");
        System.out.println(2);
        for (int N = 2; N <= 20; ) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(number);
                N++;
                count++;
            }
            status = 1;
            number++;
        }
    }
}



