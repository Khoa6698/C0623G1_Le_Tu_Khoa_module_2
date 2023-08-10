package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

import ss7_abstract_class_and_interface.bai_tap.interface_resizeable.Shape;

public class Main {
    public static void main(String[] args) {
        Square[] shapeList = new Square[3];
        Square square1 = new Square("yellow", true, 4.0);
        Square square2 = new Square("yellow", false, 8.0);
        Square square3 = new Square("yellow", false, 12.0);
        shapeList[0] = square1;
        shapeList[1] = square2;
        shapeList[2] =square3;

        for (int i = 0; i < shapeList.length; i++) {
            System.out.println("Area: " + shapeList[i].getPerimeter());
            if (shapeList[i].isFilled()) {
                System.out.println("Square at index: " + (i + 1) + " " + shapeList[i].howToColor());
            }

        }
    }
}
