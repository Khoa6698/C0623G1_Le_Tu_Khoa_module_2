package case_study.repository.impl;

import case_study.model.entity.employee.Employee;
import case_study.repository.IEmployeeRepository;
import ss16_binary_file_serialization.bai_tap.product_management.utils.ReaderAndWriter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private  final String EMPLOYEE_PATHNAME = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\case_study\\data\\employee.csv";
    private  final String COMMA = ",";

    @Override
    public List<Employee> getEmployee() {
        List<String> employeeString = ReaderAndWriter.reader(EMPLOYEE_PATHNAME);
        List<Employee> employeeList = new ArrayList<>();
        String[] array;
        for (String p : employeeString) {
            array = p.split(",");
            employeeList.add(new Employee(array[0], array[1], array[2], array[3], array[4],array[5], array[6], array[7], array[8], Double.parseDouble(array[9])));
        }
        return employeeList;
    }

    @Override
    public void createEmployee(Employee employee) {
        List<Employee> employeeList1 = this.getEmployee();
        employeeList1.add(employee);
        ReaderAndWriter.writer(EMPLOYEE_PATHNAME, this.convertToString(employeeList1));
    }


    @Override
    public void updateEmployee(String id, Employee employee) {
        List<Employee> employees = this.getEmployee();
        int index;
        for (Employee p : employees) {
            if (p.getIdStaff().equals(id)){
                index = employees.indexOf(p);
                employees.set(index, employee);
            }
        }
        ReaderAndWriter.writer(EMPLOYEE_PATHNAME, this.convertToString(employees));
    }

    @Override
    public boolean deleteEmployee(String id) {
        List<Employee> employees = this.getEmployee();
        for (Employee p : employees) {
            if (p.getIdStaff().equals(id)) {
                employees.remove(p);
                ReaderAndWriter.writer(EMPLOYEE_PATHNAME, this.convertToString(employees));
                return true;
            }
        }
        return false;
    }


    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employees = this.getEmployee();
        List<Employee> result = new ArrayList<>();
        for (Employee p : employees){
            if(p.getNameStaff().contains(name)){
                result.add(p);
            }
        }
        return result;
    }

    private List<String> convertToString(List<Employee> employee){
        List<String> strings = new ArrayList<>();
        for (Employee p : employee){
            strings.add(p.getIdStaff()+COMMA+p.getNameStaff()+COMMA
                    +p.getBirthDay()+COMMA+p.getSex()
                    +COMMA+p.getIdentityCard()+COMMA+p.getPhone()+COMMA
                    +p.getEmail()+COMMA+p.getLevelType()+COMMA
                    +p.getPositionType()+COMMA+p.getSalary());

        }
        return strings;
    }
}
