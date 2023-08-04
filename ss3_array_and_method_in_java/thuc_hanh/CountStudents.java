package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size=scanner.nextInt();
            if(size>30){
                System.out.println("Not exceed 30");

            }
        }while (size>30);
        array = new int[size];
        int i = 0;
        while (i< args.length){
            System.out.println("A mark for student "+ (i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        int count =0;
        System.out.println("List of mark: ");
        for (int j = 0; j < args.length; j++) {
            System.out.println(array[j]);
            if(array[j]>=5&&array[j]<=10)
                count++;
        }
        System.out.println("The number of student passing the exam is: "+count);
    }
}
