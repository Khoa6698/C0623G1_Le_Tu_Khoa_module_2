package ss8_clean_code_refactoring.bai_tap.student_management.model.entity;
import java.util.Date;

public class Student extends Person{
    private String className;
    private double score;

    public Student(String id, String name, Date birthDate, Boolean sex, String className, double score) {
        super(id, name, birthDate, sex);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "className='" + className + '\'' +
                ", score=" + score +
                "} ";
    }
}
