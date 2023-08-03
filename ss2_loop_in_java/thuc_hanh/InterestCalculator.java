package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Money nvestment: ");
        money = scanner.nextDouble();
        System.out.println("Money of month:");
        month = scanner.nextInt();
        System.out.println("Interest rate:");
        interest_rate=scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total = money*(interest_rate/100/12)*3;
        }
        System.out.println("Total of interest: "+total);
    }
}
