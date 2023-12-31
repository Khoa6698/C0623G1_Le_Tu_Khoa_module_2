package ss1_introdution_to_java.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Weight(kg): ");
        weight = scanner.nextDouble();

        System.out.println("Height(m): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: ");
        if (bmi < 18) {
            System.out.println(bmi + " Underweight");
        } else if (bmi < 25) {
            System.out.println(bmi + " Normal");
        } else if (bmi < 30) {
            System.out.println(bmi + " Overweight");
        } else {
            System.out.println(bmi + " Obese");
        }
    }
}
