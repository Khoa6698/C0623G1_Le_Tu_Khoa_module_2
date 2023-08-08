package ss5_access_modifier_static_method_property.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student r1 = new Student(111,"Giang");
        Student r2 = new Student(222,"Thanh");
        Student r3 = new Student(333,"Kiet");

        r1.display();
        r2.display();
        r3.display();
    }
}
