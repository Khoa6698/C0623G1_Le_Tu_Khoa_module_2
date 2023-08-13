package ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.impl;

import ss8_clean_code_refactoring.bai_tap.student_management.model.entity.Person;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.DeletePerson;
import ss8_clean_code_refactoring.bai_tap.student_management.model.sevice.GetPersons;

import java.util.List;
import java.util.Objects;

public class DeletePersonImpl implements DeletePerson {
    private final GetPersons personList;

    public DeletePersonImpl(GetPersons personList) {
        this.personList = personList;
    }

    @Override
    public boolean removePerson(String id) {
        List<Person> persons = personList.getPersons();
        return persons.removeIf(person -> Objects.equals(person.getId(), id));
    }
}
