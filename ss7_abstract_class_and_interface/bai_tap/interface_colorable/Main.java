package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square =new Square(5);
        System.out.println(square);

        square.howToColor();
    }
}
