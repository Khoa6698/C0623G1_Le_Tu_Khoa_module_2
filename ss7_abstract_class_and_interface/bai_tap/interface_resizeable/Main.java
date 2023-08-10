package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Main {

    public static void main(String[] args) {
        double percent = (int) (Math.random() * 100 + 1);
        Shape[] shapeList = new Shape[3];

        Shape shape1 = new Square("yellow", true, 4.0);
        
        Shape shape2 = new Rectangle("red", false, 4.0, 8.0);

        Shape shape3 = new Circle("blue", false, 5.0);

        shapeList[0] = shape1;
        shapeList[1] = shape2;
        shapeList[2] = shape3;

        for (int i = 0; i < shapeList.length; i++) {
            System.out.println("Before: " + shapeList[i].getPerimeter());
            shapeList[i].resize(percent);
            System.out.println("After: " + shapeList[i].getPerimeter());
        }
    }
}


