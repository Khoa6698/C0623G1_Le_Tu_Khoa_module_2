package ss15_exception_handling_debug.bai_tap.check_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhap canh a ");
            int a = scanner.nextInt();
            System.out.println("Nhap canh b ");
            int b = scanner.nextInt();
            System.out.println("Nhap canh c ");
            int c = scanner.nextInt();
            checkTriangle(a, b, c);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
