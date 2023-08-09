package ss6_inheritance.bai_tap.class_point_moveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){}

    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] getSpeed = {this.getXSpeed(), this.getYSpeed()};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", Speed="+ Arrays.toString(getSpeed())+
                '}';
    }

    public MoveablePoint move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return this;
    }
}
