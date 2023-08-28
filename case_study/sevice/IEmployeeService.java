package case_study.sevice;

import case_study.model.entity.employee.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getEmployee();

    void createEmployee(Employee employee);


    void updateEmployee(String id, Employee employee);

    boolean deleteEmployee(String id);

    List<Employee> searchEmployee(String name);

}
