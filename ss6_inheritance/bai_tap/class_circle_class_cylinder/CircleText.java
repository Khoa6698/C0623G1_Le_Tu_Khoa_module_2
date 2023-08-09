package ss6_inheritance.bai_tap.class_circle_class_cylinder;

public class CircleText {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);
            circle.getRadius();
            circle.getArea();
            circle = new Circle(4.0, "Blue");
            System.out.println(circle);
        }
}
