package ss15_exception_handling_debug.thuc_hanh.number_format_exception;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri x:");
        int x = scanner.nextInt();
        System.out.println("Nhap gia tri y:");
        int y = scanner.nextInt();
        NumberFormatException numberFormatException = new NumberFormatException();
        numberFormatException.calculate(x,y);
    }

    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x+y = "+a);
            System.out.println("hieu x-y = "+b);
            System.out.println("Tich x*y = "+c);
            System.out.println("Thuong x/y = "+d);
        }catch (Exception e){
            System.out.println("Xay ra ngoai le: "+ e.getMessage());
        }
    }
}
