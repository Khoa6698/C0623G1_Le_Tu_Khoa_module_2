package ss8_clean_code_refactoring.bai_tap.student_management.model.entity;
import java.util.Date;

public class Teacher extends Person{
    private String major;

    public Teacher(String id, String name, Date birthDate, Boolean sex, String major) {
        super(id, name, birthDate, sex);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "major='" + major + '\'' +
                '}';
    }
}
