package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class MoneyCheck {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What money your check USA>VND: ");
        usd = scanner.nextDouble();
        double check = usd * 23000;
        System.out.println("VND money: "+check);
    }
}
