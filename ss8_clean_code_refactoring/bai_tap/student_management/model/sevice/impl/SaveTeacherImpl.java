package ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl;

import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Teacher;
import ss8_clean_code_refactoring.bai_tap.student_management.model.database.DBForSavePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveTeacher;


public class SaveTeacherImpl implements SaveTeacher {
    @Override
    public void save(Teacher teacher) {
        Person teacher1 = new Teacher(teacher.getId(),
                teacher.getName(),
                teacher.getBirthDate(),
                teacher.getSex(),
                teacher.getMajor());
        DBForSavePerson.personList.add(teacher1);
    }
}
