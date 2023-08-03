package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        a = scanner.nextInt();
        System.out.println("b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greate common factor");
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
                System.out.println("Greate common factor "+a);
            }
        }
    }
}
