package ss5_access_modifier_static_method_property.bai_tap.student;

public class Student {
    private String name = "John";
    public String classes= "C02";

    public Student(){}

    public void setName(String name){this.name = name;}

    public void setClasses(String classes){this.classes = classes;}

    public String setname(){return name;}

}
