package ss11_dsa_stack_queue.thuc_hanh.stack_in_linked_list;

import static ss11_dsa_stack_queue.thuc_hanh.stack_in_linked_list.MyGenericStack.stackOfIStrings;
import static ss11_dsa_stack_queue.thuc_hanh.stack_in_linked_list.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
