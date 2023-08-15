package ss11_dsa_stack_queue.bai_tap.convert_decimal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> decimal = new Stack<>();
        System.out.println("Nhap so thap phan: ");
        int num = scanner.nextInt();

        while (num!=0){
            int binary = num%2;
            decimal.push(binary);
            num /=2;
        }
        System.out.println("Gia tri nhi phan la: ");
        while (!(decimal.isEmpty())){
            System.out.println(decimal.pop());
        }
    }
}
