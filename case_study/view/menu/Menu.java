package case_study.view.menu;

import case_study.view.employee.EmployeeMenu;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
//    private final EmployeeController employeeController = new EmployeeController()
    private  final EmployeeMenu employeeMenu = new EmployeeMenu();

    public void displayMainMenu(){
        System.out.println("===========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("Lựa chọn theo số");
        System.out.println("==========================");

        int option;
        do {
            option = Integer.parseInt(scanner.nextLine());
        }while (option <= 0 && option > 6);

        switch (option){
            case 1:
                employeeManagement();
                break;
            case 2:
                customerManagement();
                break;
            case 3:
                facilityManagement();
                break;
            case 4:
                bookingManagement();
                break;
            case 5:
                promotionManagement();
                break;
            case 6:
                System.out.println("Thanks for watching");
        }
    }

    public void employeeManagement(){
        System.out.println("===Employee Management===");
        System.out.println("1 Display list employees");
        System.out.println("2 Add new employee");
        System.out.println("3 Edit employee");
        System.out.println("4 Delete employee");
        System.out.println("5 Search by name employee");
        System.out.println("6 Return main menu");
        System.out.println(" Lựa chọn theo số");
        System.out.println("==========================");
        employeeMenu.employeeRender();
    }

    public static void customerManagement(){
        System.out.println("===Customer Management===");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
        System.out.println("---------------------------");
    }

    public static void facilityManagement(){
        System.out.println("===Facility Management===");
        System.out.println("1 Display list facility");
        System.out.println("2 Add new facility");
        System.out.println("3 Display list facility maintenance");
        System.out.println("4 Delete facility");
        System.out.println("5 Return main menu");
        System.out.println("Chọn phương thức theo số ");
        System.out.println("----------------------------");
    }

    public static void bookingManagement(){
        System.out.println("===Booking Management===");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("Chọn phương thức theo số ");
        System.out.println("----------------------------");
    }

    public static void promotionManagement(){
        System.out.println("===Promotion Management===");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("Chọn phương thức theo số ");
        System.out.println("-----------------------------");
    }
}
