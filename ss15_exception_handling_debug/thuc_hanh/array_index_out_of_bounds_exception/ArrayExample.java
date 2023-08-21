package ss15_exception_handling_debug.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sach ngau nhieu tu 0 toi 100: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        return array;
    }
}
