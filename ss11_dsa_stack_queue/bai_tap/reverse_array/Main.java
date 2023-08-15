package ss11_dsa_stack_queue.bai_tap.reverse_array;


import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        wStack.push(10);
        wStack.push(20);
        wStack.push(30);
        wStack.push(40);
        wStack.push(50);
        System.out.println("Mang truoc khi dao nguoc");
        System.out.println(Arrays.toString(wStack.toArray()));

        int size = wStack.size();
        Stack<Integer> listPopWStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            listPopWStack.push(wStack.pop());
        }

        wStack = listPopWStack;

        System.out.println("Mang sau khi dao nguoc");
        System.out.println(Arrays.toString(wStack.toArray()));
    }
}
