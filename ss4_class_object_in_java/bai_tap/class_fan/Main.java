package ss4_class_object_in_java.bai_tap.class_fan;

public class Main {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        fan1.setSpeed(ClassFan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        ClassFan fan2 = new ClassFan();
        fan2.setSpeed(ClassFan.MEDIUM);
        System.out.println(fan2);
    }
}

