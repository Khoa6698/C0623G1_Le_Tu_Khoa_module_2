package ss13_search_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        System.out.println();
        BinarySearch binarySearch = new BinarySearch();
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Nhap gia tri muon kiem tra: ");
        int value = scanner.nextInt();

        if (binarySearch(array, value) <= 0) {
            System.out.println("Khong tim thay.");
        } else {
            System.out.println("Vi tri cua so ban can tim la: " + binarySearch(array, value));
        }
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            }

            if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}

