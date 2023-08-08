package ss5_access_modifier_static_method_property.bai_tap.access_modifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.getRadio();
        circle.getArea();

        System.out.println("The area is: "+ circle.getArea());
        System.out.println("The radius is: "+circle.getArea());
    }
}
