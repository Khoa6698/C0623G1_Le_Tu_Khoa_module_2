package ss10_dsa_list.bai_tap.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList   = new MyLinkedList<String>("Phân tư đầu tiên");
        myLinkedList.printList();
        System.out.println("----------");
        myLinkedList.add(3, "Phần tử add index 3");
        myLinkedList.add(2, "Phần tử add index 2");
        myLinkedList.add(1, "Phần tử add index 1");
        myLinkedList.printList();
        System.out.println("----------");
        myLinkedList.addFirst("Phần tử add First");
        myLinkedList.printList();
        System.out.println("----------");
    }
}
