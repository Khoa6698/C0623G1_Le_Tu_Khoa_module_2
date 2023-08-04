package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class TotalLineCalculation {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {3, 4, 6}, {5, 6, 7}};
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i][i];
        }

        System.out.println("Tổng các phần tử có tọa độ ở hàng ngang và cột dọc bằng nhau: " + sum);

        int soDong, soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] A = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println("\n");
        }
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            sum2 += A[i][i];
        }
        System.out.println("Tổng các phần tử có tọa độ ở hàng ngang và cột dọc bằng nhau: " + sum2);
    }
}
