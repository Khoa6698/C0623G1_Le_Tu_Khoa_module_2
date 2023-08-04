package ss3_array_and_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = new int[array.length + 1];
        System.out.println("Mang ban dau co");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Nhap vi tri index can chen: ");
        int index = scanner.nextInt();
        System.out.println("Nhap phan tu muon them vao: ");
        int x = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array1[i] = x;
            } else {
                array1[i] = array[k];
                k++;
                array1[i] = array[i];

            }
        }
        for (int i = 0; i < array1.length -1; i++) {
            System.out.println(array1[i]);
        }
    }
}

