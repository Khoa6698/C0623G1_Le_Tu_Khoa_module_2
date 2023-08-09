package ss6_inheritance.bai_tap.class_point2d_class_point3d;

public class Point2DText {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.getX();
        point2D.getY();
        point2D.getXY();
        point2D = new Point2D(2.0f,3.0f);
        System.out.println(point2D);
    }
}
