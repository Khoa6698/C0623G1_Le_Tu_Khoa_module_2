package ss1_introdution_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();

        switch (month) {
            case 2 -> System.out.println("Có 28 và 29 ngày");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Thang " + month + " co 31 ngay.");
            case 4, 6, 9, 11 -> System.out.println("Thang " + month + " co 30 ngay");
        }
    }
}
