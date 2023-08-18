package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class SettingInsertionSort {

     static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j]>key){
                array[j+1] = array[j];
                j = j -1;
            }
            array[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {5,8,23,67,88,4,9};
        System.out.println("Mang ban dau la:");
        System.out.println(Arrays.toString(array1));
        SettingInsertionSort settingInsertionSort = new SettingInsertionSort();
        settingInsertionSort.insertionSort(array1);
        System.out.println("Mang sau khi sap xep: ");
        System.out.println(Arrays.toString(array1));
    }
}
