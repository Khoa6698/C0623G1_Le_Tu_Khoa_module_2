package ss5_access_modifier_static_method_property.bai_tap.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.setname());
        student.setName("Khoa");
        student.setClasses("C0623G1");
        System.out.println(student.setname());

    }
}
