package ss8_clean_code_refactoring.bai_tap.student_management.controller;
import java.util.List;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Student;
import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Teacher;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.DeletePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.GetPersons;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveStudent;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.SaveTeacher;

public class CodeGymSystemManagermentController {
    private final SaveTeacher saveTeacher;
    private final SaveStudent saveStudent;
    private final GetPersons getPersons;
    private final DeletePerson deletePerson;

    public CodeGymSystemManagermentController(SaveTeacher saveTeacher,
                                              SaveStudent saveStudent,
                                              GetPersons getPersons,
                                              DeletePerson deletePerson) {
        this.saveTeacher = saveTeacher;
        this.saveStudent = saveStudent;
        this.getPersons = getPersons;
        this.deletePerson = deletePerson;
    }

    public void addTeacher(Teacher teacher) {
        saveTeacher.save(teacher);
    }

    public void addStudent(Student student) {
        saveStudent.save(student);
    }

    public List<Person> getPersonList() {
        return getPersons.getPersons();
    }

    public boolean deletePerson(String id) {
        return deletePerson.removePerson(id);
    }
}
