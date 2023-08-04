package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the square triangle top-left");
        System.out.println("3. Print the square triangle top-right");
        System.out.println("4. Print the square triangle botton-left");
        System.out.println("5. Print the square triangle botton-right");
        System.out.println("6. Print isosceles triangle");
        System.out.println("7. Exit");
        System.out.println("Enter your choice: ");

        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int hight;
                    int horizontal;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Height:");
                    hight = scanner1.nextInt();
                    System.out.println("Horizontal:");
                    horizontal = scanner1.nextInt();
                    System.out.println("1. Print the rectangle.");
                    for (int i = 0; i < hight; i++) {
                        for (int j = 0; j < horizontal; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int hight1;
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Height:");
                    hight1 = scanner2.nextInt();
                    System.out.println("2. Print the square triangle top-left");
                    for (int i = 0; i < hight1; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int hight3;
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Height:");
                    int hihgt3 = scanner3.nextInt();
                    System.out.println("3. Print the square triangle top-right");
                    for (int i = 1; i <= hihgt3; i++) {
                        for (int j = 1; j <= hihgt3 - i; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Height:");
                    int hihgt4 = scanner4.nextInt();
                    System.out.println("4. Print the square triangle botton-left");
                    for (int i = hihgt4; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Height:");
                    int hihgt5 = scanner5.nextInt();
                    System.out.println("5. Print the square triangle botton-right");
                    for (int i = 1; i <= hihgt5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("   ");
                        }
                        for (int j = i; j <= hihgt5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Height:");
                    int hihgt6 = scanner6.nextInt();
                    System.out.println("6. Print isosceles triangle");
                    for (int i = 1; i <= hihgt6; i++) {
                        for (int j = i; j <= hihgt6; j++) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                case 7:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
