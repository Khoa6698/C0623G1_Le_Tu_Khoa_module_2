package case_study.sevice.impl;

import case_study.model.entity.employee.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.sevice.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> getEmployee() {
        return this.employeeRepository.getEmployee();
    }

    @Override
    public void createEmployee(Employee employee) {
        this.employeeRepository.createEmployee(employee);
    }

    @Override
    public void updateEmployee(String id,Employee employee) {
        this.employeeRepository.updateEmployee(id,employee);
    }

    @Override
    public boolean deleteEmployee(String id) {
        return this.employeeRepository.deleteEmployee(id);
    }

    @Override
        public List<Employee> searchEmployee(String name) {
        return this.employeeRepository.searchEmployee(name);
    }
}
