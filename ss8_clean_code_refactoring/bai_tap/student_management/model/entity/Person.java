package ss8_clean_code_refactoring.bai_tap.student_management.model.entity;

import java.util.Date;

public abstract class Person {
    private String id;
    private String name;
    private Date birthDate;
    private Boolean sex;

    protected Person(String id, String name, Date birthDate, Boolean sex) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                '}';
    }
}
