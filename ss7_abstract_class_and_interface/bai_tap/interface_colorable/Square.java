package ss7_abstract_class_and_interface.bai_tap.interface_colorable;

public class Square implements Colorable {

    private int weight;

    public Square() {
    }

    public Square(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Square{" +
                "weight=" + getWeight() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("howToColor");
    }
}
