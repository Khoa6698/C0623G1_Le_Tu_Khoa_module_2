package ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl;

import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.database.DBForSavePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.GetPersons;

import java.util.List;


public class GetPersonsImpl implements GetPersons {
    public List<Person> getPersons() {
        return DBForSavePerson.personList;
    }
}
