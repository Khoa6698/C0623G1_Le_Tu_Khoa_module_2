package ss4_class_object_in_java.bai_tap.quadratic_equation;


import ss4_class_object_in_java.bai_tap.quadratic_equation.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Nghiem 1 = "+quadraticEquation.getRoot1()+", Nghiem 2 = "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println(quadraticEquation.getRoot1()+" 2 nghiem bang nhau.");
        }else {
            System.out.println("The equation has no roots");
        }

    }
}
