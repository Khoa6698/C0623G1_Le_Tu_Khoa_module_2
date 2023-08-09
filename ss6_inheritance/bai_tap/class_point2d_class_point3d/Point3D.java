package ss6_inheritance.bai_tap.class_point2d_class_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float [] getXYZ = {this.getX(),this.getY(),this.getZ()};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x="+getX()+
                ", y="+getY()+
                "z=" + getZ() +
                ", arr= "+ Arrays.toString(getXYZ())+
                '}';
    }
}
