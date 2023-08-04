package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Khoa","Giang","Loan","Ly","An","Truong","Thanh","Kiet"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's students: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)){
                System.out.println("List students: "+name+" is "+(i+1));
                isExist =true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found "+name+" int the list");
    }
}
