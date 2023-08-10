package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {

    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return getWidth() * getWidth();
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + ((getWidth()/100)*percent));
    }

}
