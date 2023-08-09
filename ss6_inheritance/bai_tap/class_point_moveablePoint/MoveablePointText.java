package ss6_inheritance.bai_tap.class_point_moveablePoint;

public class MoveablePointText {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5f,2f);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2f,5f,5f,2f);
        System.out.println(moveablePoint);

        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);


    }
}
