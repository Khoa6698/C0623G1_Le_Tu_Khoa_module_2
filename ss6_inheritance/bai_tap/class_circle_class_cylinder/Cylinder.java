package ss6_inheritance.bai_tap.class_circle_class_cylinder;

public class Cylinder extends Circle {
    private int height = 3;

    public Cylinder() {
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                + ", radius="+getRadius()
                + ", color="+getColor()
                +", volume="+getVolume()+
                '}';
    }
}
