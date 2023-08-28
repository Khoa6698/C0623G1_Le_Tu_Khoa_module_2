package case_study.controller;

import case_study.model.entity.employee.Employee;
import case_study.sevice.IEmployeeService;
import case_study.sevice.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    private static final IEmployeeService employeeService = new EmployeeService();

    public List<Employee> getEmployee() {
        return this.employeeService.getEmployee();
    }

    public void createEmployee(Employee employee) {
        this.employeeService.createEmployee(employee);
    }

    public void updateEmployee(String id, Employee employee) {
        this.employeeService.updateEmployee(id, employee);
    }

    public boolean deleteEmployee(String id) {
        return this.employeeService.deleteEmployee(id);
    }

    public List<Employee> searchEmployee(String name) {
        return this.employeeService.searchEmployee(name);
    }
}
