package ss15_exception_handling_debug.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vui long nhap phan tu bat ki tu 0 toi 100:");
        int index = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu o vi tri thu "+index+" la: "+array[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi hang cua mang!");
        }
    }
}
