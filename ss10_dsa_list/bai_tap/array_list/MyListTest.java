package ss10_dsa_list.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        System.out.println(myList.size());
        myList.add(0, "Thanh");
        myList.add(4, "Giang");
        myList.add(5, "An");
        myList.add(8, "Truong");
        System.out.println(myList);

        System.out.println(myList.get(1));
        myList.remove(9);
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
    }
}
