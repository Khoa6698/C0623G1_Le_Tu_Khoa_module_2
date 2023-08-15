package ss11_dsa_stack_queue.bai_tap.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter if you one check: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }

        if(inputString.equals(reverseString)){
            System.out.println("The input string is a Palindrome");
        }else {
            System.out.println("The input string is not a Palindrome");
        }
    }
}
