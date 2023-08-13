package ss8_clean_code_refactoring.bai_tap.student_management.model.database;

import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class DBForSavePerson {
    public static List<Person> personList = new ArrayList<>();

    private DBForSavePerson() {
    }
}
