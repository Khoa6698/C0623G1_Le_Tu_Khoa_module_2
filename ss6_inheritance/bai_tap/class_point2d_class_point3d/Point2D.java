package ss6_inheritance.bai_tap.class_point2d_class_point3d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setX(y);
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = this.getX();
        arr[1] = this.getY();
        return arr;
    }
// Array.toString sẽ chuyển thành chuổi.
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr="+ Arrays.toString(getXY())+
                '}';
    }
}
