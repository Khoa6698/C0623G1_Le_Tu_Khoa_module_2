package ss4_class_object_in_java.bai_tap.quadratic_equation;


public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getDiscriminant() {
        double delta = (this.b * 2) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double root1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return root2;
    }
}
