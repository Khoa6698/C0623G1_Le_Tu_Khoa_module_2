package ss8_clean_code_refactoring.bai_tap.student_management;

import ss8_clean_code_refactoring.bai_tap.student_management.controller.CodeGymSystemManagermentController;

import java.text.ParseException;

import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.DeletePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.GetPersons;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveStudent;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveTeacher;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl.DeletePersonImpl;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl.GetPersonsImpl;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl.SaveStudentImpl;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl.SaveTeacherImpl;
import ss8_clean_code_refactoring.bai_tap.student_management.view.Menu;

public class Run {
    public static void main(String[] args) {
        SaveTeacher saveTeacher = new SaveTeacherImpl();
        SaveStudent saveStudent = new SaveStudentImpl();
        GetPersons getPersons = new GetPersonsImpl();
        DeletePerson deletePerson = new DeletePersonImpl(getPersons);
        CodeGymSystemManagermentController controller =
                new CodeGymSystemManagermentController(saveTeacher, saveStudent, getPersons, deletePerson);

        Menu menu = new Menu(controller);
        try {
            menu.displayMenu();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
