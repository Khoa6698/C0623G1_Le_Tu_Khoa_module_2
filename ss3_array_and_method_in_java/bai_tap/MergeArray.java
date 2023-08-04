package ss3_array_and_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu trong mang 1:");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan tu thu "+(i+1));
            array1[i] = scanner.nextInt();
        }

        System.out.println("Phan tu co trong mang 1: ");
        show(array1);


        System.out.println("Nhap so phan tu trong mang 2:");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhan tu thu "+(i+1));
            array2[i] = scanner.nextInt();
        }
        System.out.println("Phan tu co trong mang 1: ");
        show(array2);


        int[] addressNumber = new int[m + n];
        addressArray(array1,array2,addressNumber);
        System.out.println(Arrays.toString(addressNumber));

    }
    public static void show(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] addressArray(int[] arr1,int[] arr2, int[] addressArray){
        int n = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            addressArray[i]= arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            addressArray[n] =arr2[i];
            n++;
        }
        return addressArray;
    }
}
