package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang.");
        int m = scanner.nextInt();
        int[] matrix = new int[m];
        for (int i = 0; i < m; i++) {
                System.out.println("nhap vi tri thu "+(i+1));
                matrix[i] = scanner.nextInt();
            }


        int min = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }
        System.out.println(min +" La gia tri nho nha.");

    }
}
