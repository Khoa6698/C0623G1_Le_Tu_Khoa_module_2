package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
