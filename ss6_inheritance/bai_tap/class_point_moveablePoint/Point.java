package ss6_inheritance.bai_tap.class_point_moveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){}

    public Point(float x,float y){
        this.x = x;
        this.y =y;
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

    public void setXY(float x,float y){
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY(){
        float[] getXY = {this.getX(),this.getY()};
        return getXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", getXY="+ Arrays.toString(getXY())+
                '}';
    }
}
