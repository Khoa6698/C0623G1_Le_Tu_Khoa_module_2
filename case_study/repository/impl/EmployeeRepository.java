package case_study.repository.impl;

import case_study.model.entity.employee.Employee;
import case_study.repository.IEmployeeRepository;
import ss16_binary_file_serialization.bai_tap.product_management.utils.ReaderAndWriter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_PATHNAME = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\case_study\\data\\employee.csv";
    private static final String COMMA = ",";
    private String id;
    private String name;

    @Override
    public List<Employee> getEmployee() {
        List<String> employeeString = ReaderAndWriter.reader(EMPLOYEE_PATHNAME);
        List<Employee> employeeList = new ArrayList<>();
        String[] array = null;
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
    public void updateEmployee(Employee employee) {
        List<Employee> employees = this.getEmployee();
        for (Employee p : employees) {
            if (p.getStaffId(id) == employee.getStaffId(id)) {
                p.setStaffName(employee.getStaffName(name));
                p.setBirthDay(employee.getBirthDay());
                p.setSex(employee.isSex());
                p.setIdentityCard(employee.getIdentityCard());
                p.setPhone(employee.getPhone());
                p.setEmail(employee.getEmail());
                p.setEmail(employee.getEmail());
                p.setLevelType(employee.getLevelType());
                p.setPositionType(employee.getPositionType());
                p.setSalary(employee.getSalary());
                break;
            }
        }
        ReaderAndWriter.writer(EMPLOYEE_PATHNAME, this.convertToString(employees));
    }

    @Override
    public boolean deleteEmployee(String id) {
        List<Employee> employees = this.getEmployee();
        for (Employee p : employees) {
            if (p.getStaffId(id).equals(id)) {
                employees.remove(p);
                return true;
            }
        }
        ReaderAndWriter.writer(EMPLOYEE_PATHNAME, this.convertToString(employees));
        return false;
    }


    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employees = this.getEmployee();
        List<Employee> result = new ArrayList<>();
        for (Employee p : employees){
            if(p.getStaffName(name).startsWith(name)){
                result.add(p);
            }
        }
        return result;
    }

    private List<String> convertToString(List<Employee> employee){
        List<String> strings = new ArrayList<>();
        for (Employee p : employee){
            strings.add(p.getStaffId(id)+COMMA+p.getStaffName(name)+COMMA
                    +p.getBirthDay()+COMMA+p.isSex()
                    +COMMA+p.getIdentityCard()+COMMA+p.getPhone()+COMMA
                    +p.getEmail()+COMMA+p.getLevelType()+COMMA
                    +p.getPositionType()+COMMA+p.getSalary());

        }
        return strings;
    }
}
