package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2}, {3, 4}, {5, 6}};
        int cell = 1;
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i][cell];
        }
        System.out.println("Tong cua cot" + cell + ": " + sum);

        int current;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang: ");
        current = scanner.nextInt();
        System.out.println("Nhap vao so cot cua mang: ");
        column = scanner.nextInt();

        int[][] A = new int[current][column];

        for (int i = 0; i < current; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println("\n");
        }
        int cell2 = 2;
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            sum2 += A[i][cell];
        }
        System.out.println("Tong cua cot " + cell2 + ": " + sum2);
    }
}
