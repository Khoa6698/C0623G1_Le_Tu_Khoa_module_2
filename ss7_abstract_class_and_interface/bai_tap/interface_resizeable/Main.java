package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Main {

    public static void main(String[] args) {
        // Shape main
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        shape.resize(4.0);


        // Circle main

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle.resize(5.0);


        // RectangleTest

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        rectangle.resize(6.0);
    }
}


