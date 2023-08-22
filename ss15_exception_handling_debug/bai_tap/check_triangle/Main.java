package ss15_exception_handling_debug.bai_tap.check_triangle;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = 0;
            int b = 0;
            int c = 0;
            do {
                try {
                    System.out.println("Nhap canh a ");
                    a = Integer.parseInt(scanner.nextLine());
                    if (a < 0) {
                        System.out.println("Vui long nhanh lại");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ban can nhap so");
                }
            } while (a <= 0);

            do {
                try {
                    System.out.println("Nhap canh b ");
                    b = Integer.parseInt(scanner.nextLine());
                    if (b < 0) {
                        System.out.println("Vui long nhanh lại");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ban can nhap so");
                }
            } while (b <= 0);

            do {
                try {
                    System.out.println("Nhap canh c ");
                    c = Integer.parseInt(scanner.nextLine());
                    if (c < 0 ) {
                        System.out.println("Vui long nhanh lại");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ban can nhap so");
                }
            } while (c <= 0);
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: 2 canh khong the nho hon canh con lai");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
