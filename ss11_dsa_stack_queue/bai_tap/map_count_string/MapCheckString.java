package ss11_dsa_stack_queue.bai_tap.map_count_string;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapCheckString {
    public static void main(String[] args) {
        String string = "Dem so lan xuat hien cua moi tu trong mot chuoi su dung Map";
        String[] arrayString = string.split(" ");
        System.out.println(Arrays.toString(arrayString));

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String value : arrayString) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                Integer count = map.get(value);
                count++;
                map.replace(value, count);
            }
        }
        System.out.println(map);
    }
}

