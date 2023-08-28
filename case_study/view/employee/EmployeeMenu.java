package case_study.view.employee;

import case_study.controller.EmployeeController;
import case_study.model.entity.employee.Employee;
import case_study.utils.Regex;
import case_study.view.menu.Menu;

import java.util.Scanner;

public class EmployeeMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();


    public void employeeRender() {
        int optionEmployee;
        do {
//            employeeRender();
            optionEmployee = Integer.parseInt(scanner.nextLine());
        } while (optionEmployee <= 0 && optionEmployee > 6);

        switch (optionEmployee) {
            case 1:
                employeeController.getEmployee();
                break;
            case 2:
                Employee newEmployee = createEmployee();
                employeeController.createEmployee(newEmployee);

                break;
            case 3:
//                updateEmployee();
                break;
            case 4:
//                deleteEmployee();
                break;
            case 5:
//                searchEmployee();
                break;
            case 6:
                Menu.displayMainMenu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + optionEmployee);
        }
    }

    public void getEmployee() {
        this.employeeController.getEmployee();
    }

    private Employee createEmployee() {
        Employee employee = new Employee();
        System.out.println("Nhap id nhan vien: ");
        String id = scanner.nextLine();
        while (!Regex.regexIdEmployee(id)) {
            System.out.println("Id ban nhap khong hop le");
            id = scanner.next();
        }
        employee.setStaffId(id);
        System.out.println("Nhap name nhan vien: ");
        String name = scanner.nextLine();
        while (!Regex.CheckNameEmployee(name)) {
            System.out.println("Name ban nhap khong hop le");
            name = scanner.next();
        }
        employee.setStaffName(name);
        System.out.println("Nhập ngay sinh: ");
        String birthDay = scanner.nextLine();
        while (!Regex.calculateAgeWithJodaTime(Regex.covertStringToDate(birthDay))) {
            System.out.println("Ban chua du tuoi!");
            birthDay = scanner.next();
        }
        employee.setBirthDay(birthDay);

        System.out.println("Nhap CMND cua ban: ");
        String idCard = scanner.nextLine();
        while (!Regex.regexIdCardEmployee(idCard)) {
            System.out.println("Id card cua ban khong hop le!");
            idCard = scanner.next();
        }
        employee.setIdentityCard(idCard);
        System.out.println("Nhap so dien thoai cua ban: ");
        String phone = scanner.nextLine();
        while (!Regex.regexPhoneNumberEmployee(phone)) {
            System.out.println("So dien thoai khong hop le!");
            phone = scanner.next();
        }
        employee.setPhone(phone);
        System.out.println("Nhap trinh đo cua ban theo so thu tu: ");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao dang ");
        System.out.println("3. Dai hoc ");
        System.out.println("4. Sau dai hoc ");
        System.out.println("------------------------");
        String levelString = null;
        int level;
        do {
            level = Integer.parseInt(scanner.nextLine());
        } while (level <= 0 || level > 4);
        switch (level) {
            case 1:
                levelString = "intermediate";
                break;
            case 2:
                levelString = "college";
                break;
            case 3:
                levelString = "university";
                break;
            case 4:
                levelString = "afterUniversity";
                break;
        }
        employee.setLevelType(levelString);
        System.out.println("Nhap vi trí cua ban theo so thu tu duoc neu:");
        System.out.println("1. Le tan");
        System.out.println("2. Phuc vu");
        System.out.println("3. Chuyen vien");
        System.out.println("4. Giam sat");
        System.out.println("5. Quan ly");
        System.out.println("6. Giam doc");
        System.out.println("-----------------------");
        String positionString = null;
        int number2;
        do {
            System.out.println("Nhap lua chon cua ban: ");
            number2 = Integer.parseInt(scanner.nextLine());
        } while (number2 <= 0 || number2 > 6);

        switch (number2) {
            case 1:
                positionString = "lễ tân";
                break;
            case 2:
                positionString = "staff";
                break;
            case 3:
                positionString = "expert";
                break;
            case 4:
                positionString = "supervisory";
                break;
            case 5:
                positionString = "management";
                break;
            case 6:
                positionString = "manager";
                break;
        }
        employee.setPositionType(positionString);
        System.out.println("Nhap luong cua ban: ");
        double salary = Double.parseDouble(scanner.nextLine());
        if (salary <= 0) {
            System.out.println("Luong khong the nho hoac bang 0!");
            salary = Double.parseDouble(scanner.next());
        }
        employee.setSalary(salary);
        return employee;
    }
}
