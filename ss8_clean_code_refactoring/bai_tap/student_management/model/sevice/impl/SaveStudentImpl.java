package ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl;

import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Student;
import ss8_clean_code_refactoring.bai_tap.student_management.model.database.DBForSavePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveStudent;


public class SaveStudentImpl implements SaveStudent {
    @Override
    public void save(Student student) {
        Person student1 = new Student(student.getId(),
                student.getName(),
                student.getBirthDate(),
                student.getSex(),
                student.getClassName(),
                student.getScore());
        DBForSavePerson.personList.add(student1);
    }
}
