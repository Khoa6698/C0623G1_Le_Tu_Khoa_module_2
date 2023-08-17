package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class LargestLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String string = scanner.nextLine();

        LinkedList<Character> largest = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size()>largest.size()){
                largest.clear();
                largest.addAll(list);
            }
            list.clear();
        }

        for (Character character: largest) {
            System.out.println(character);
        }
    }
}
