package case_study.view.menu;

import case_study.model.entity.customer.Customer;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        int option;
        do {
            displayMainMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    EmployeeMenu employeeMenu1 = new EmployeeMenu();
                    employeeMenu1.employeeRender();
                    break;
                case 2:
                    CustomerMenu customerMenu = new CustomerMenu();
                    customerMenu.customerRender();
                    break;
                case 3:
                     FacilityMenu facilityMenu = new FacilityMenu();
                     facilityMenu.facilityRender();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Thanks for watching");
            }
        } while (option!=6);
    }

    public void displayMainMenu() {
        System.out.println("===========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("chon phuong thuc theo so");
        System.out.println("==========================");
    }




    public static void bookingManagement() {
        System.out.println("===Booking Management===");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("chon phuong thuc theo so");
        System.out.println("----------------------------");
    }

    public static void promotionManagement() {
        System.out.println("===Promotion Management===");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("Chọn phương thức theo số ");
        System.out.println("-----------------------------");
    }
}
