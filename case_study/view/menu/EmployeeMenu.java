package case_study.view.menu;

import case_study.controller.EmployeeController;
import case_study.model.entity.employee.Employee;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class   EmployeeMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();


    public void employeeRender() {
        int optionEmployee;
        do {
            employeeManagement();
            optionEmployee = Integer.parseInt(scanner.nextLine());
            switch (optionEmployee) {
                case 1:
                    List<Employee> employees = this.employeeController.getEmployee();
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    Employee newEmployee = createEmployee();
                    employeeController.createEmployee(newEmployee);
                    System.out.println("Successfully added new");
                    break;
                case 3:
                    employeeController.updateEmployee(inputIdEmployee(), createEmployee());
                    break;
                case 4:
                    employeeController.deleteEmployee(inputIdEmployee());
                    break;
                case 5:
                    for (Employee e : employeeController.searchEmployee(inputNameEmployee())){
                        System.out.println(e);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Goodbye!");
            }

        } while (optionEmployee !=6);
    }


    public static void employeeManagement(){
        System.out.println("===Employee Management===");
        System.out.println("1 Display list employees");
        System.out.println("2 Add new employee");
        System.out.println("3 Edit employee");
        System.out.println("4 Delete employee");
        System.out.println("5 Search by name employee");
        System.out.println("6 Return main menu");
        System.out.println("==========================");
        System.out.println("Select method by number: ");

    }
    private Employee createEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter id staff: ");
        String id = scanner.nextLine();
        while (Regex.regexId(id)) {
            System.out.println("The id you entered is not valid!");
            id = scanner.next();
        }
        employee.setIdStaff(id);
        System.out.println("Enter name staff: ");
        String name = scanner.nextLine();
        while (Regex.CheckName(name)) {
            System.out.println("The name you entered is not valid!");
            name = scanner.next();
        }
        employee.setNameStaff(name);
        System.out.println("Enter birthday: ");
        String birthDay = scanner.nextLine();
        while (Regex.calculateAgeWithJodaTime(Regex.covertStringToDate(birthDay))) {
            System.out.println("You are not old enough!");
            birthDay = scanner.next();
        }
        employee.setBirthDay(birthDay);
        System.out.println("Enter your gender: ");
        String sex = scanner.nextLine();
        employee.setSex(sex);
        System.out.println("Enter your ID card: ");
        String idCard = scanner.nextLine();
        while (Regex.regexIdCard(idCard)) {
            System.out.println("The id card you entered is not valid! !");
            idCard = scanner.next();
        }
        employee.setIdentityCard(idCard);
        System.out.println("Enter your phone: ");
        String phone = scanner.nextLine();
        while (Regex.regexPhoneNumberEmployee(phone)) {
            System.out.println("The phone number you entered is not valid!");
            phone = scanner.next();
        }
        employee.setPhone(phone);
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        while (Regex.gmailRegex(email)){
            System.out.println("Email is not valid!");
            email = scanner.next();
        }
        employee.setEmail(email);
        System.out.println("Nhap trinh đo cua ban theo so thu tu: ");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao dang ");
        System.out.println("3. Dai hoc ");
        System.out.println("4. Sau dai hoc ");
        System.out.println("------------------------");
        String levelString = null;
        int level;
        do {
            System.out.println("Enter your selection: ");
            level = Integer.parseInt(scanner.nextLine());
        } while (level <= 0 || level > 4);
        switch (level) {
            case 1 -> levelString = "Intermediate";
            case 2 -> levelString = "College";
            case 3 -> levelString = "University";
            case 4 -> levelString = "AfterUniversity";
        }
        employee.setLevelType(levelString);
        System.out.println("Choose by number below  :");
        System.out.println("1. Receptionists");
        System.out.println("2. Staff");
        System.out.println("3. Expert");
        System.out.println("4. Supervisory");
        System.out.println("5. Management");
        System.out.println("6. Manager");
        System.out.println("-----------------------");
        String positionString = null;
        int number2;
        do {
            System.out.println("Enter your selection: ");
            number2 = Integer.parseInt(scanner.nextLine());
        } while (number2 <= 0 || number2 > 6);

        switch (number2) {
            case 1 -> positionString = "Receptionists";
            case 2 -> positionString = "Staff";
            case 3 -> positionString = "Expert";
            case 4 -> positionString = "Supervisory";
            case 5 -> positionString = "Management";
            case 6 -> positionString = "Manager";
        }
        employee.setPositionType(positionString);
        System.out.println("enter your salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        if (salary <= 0) {
            System.out.println("salary cannot be 0!");
            salary = Double.parseDouble(scanner.next());
        }
        employee.setSalary(salary);
        return employee;
    }

    public String inputIdEmployee() {
        String string;
        do {
            System.out.println("Enter id staff:");
            string = scanner.nextLine();
        } while (Regex.regexId(string));
        return string;
    }

    public String inputNameEmployee() {
        String name;
        do {
            System.out.println("Enter name staff:");
            name = scanner.nextLine();
        } while (Regex.CheckName(name));
        return name;
    }
}
