package case_study.repository;

import case_study.model.entity.employee.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> getEmployee();
    void createEmployee(Employee employee);

    void updateEmployee(String id, Employee employee);

    boolean deleteEmployee(String id);

    List<Employee> searchEmployee(String name);
}
