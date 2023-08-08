package ss5_access_modifier_static_method_property.bai_tap.access_modifier;

public class Circle {
    private double radio = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.pow(this.radio,2)*Math.PI;
    }
}
