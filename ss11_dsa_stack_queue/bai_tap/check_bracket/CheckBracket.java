package ss11_dsa_stack_queue.bai_tap.check_bracket;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        System.out.println("Enter check bracket:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();
        System.out.println(Arrays.toString(charArray));

        Stack<Character> stack = new Stack<>();
        for (char characters : charArray) {
            if (characters == '(') {
                stack.push(characters);
            } else if (characters == ')') {
                if (stack.empty()) {
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Pass");
        }else {
            System.out.println("Not pass");
        }
    }
}
