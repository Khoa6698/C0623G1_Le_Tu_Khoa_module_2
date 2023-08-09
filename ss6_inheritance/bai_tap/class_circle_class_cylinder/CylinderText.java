package ss6_inheritance.bai_tap.class_circle_class_cylinder;

public class CylinderText {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.getHeight();
        cylinder.getVolume();
        cylinder = new Cylinder(5);
        System.out.println(cylinder);
        cylinder = new Cylinder(4,4.0,"Black");
        System.out.println(cylinder);
    }
}
