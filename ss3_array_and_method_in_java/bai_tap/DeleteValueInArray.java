package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhan so phan tu co trong mang: ");
            number = scanner.nextInt();
        } while (number <= 0);


        int[] array = new int[number];
        int[] array2 = new int[array.length-1];
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < number; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Cac phan tu trong mang: ");
        show(array);

        System.out.println("Nhap so muon xoa: ");
        int delete = scanner.nextInt();
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == delete) {
               continue;
            }
            array2[j++] = array[i];
        }
        System.out.println("Mang sau khi xoa: ");
        show(array2);
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
