package ss4_class_object_in_java.bai_tap.stop_watch;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(100000);

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();

        long elapsedTime = stopWatch.getElapsedTime();

        System.out.println("Selection Sort took " + elapsedTime + " milliseconds");
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
