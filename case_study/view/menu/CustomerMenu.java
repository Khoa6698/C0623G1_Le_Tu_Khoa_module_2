package case_study.view.menu;

import case_study.controller.CustomerController;
import case_study.model.entity.customer.Customer;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();

    public void customerRender() {
        int optionCustomer;
        do {
            customerManagement();
            optionCustomer = Integer.parseInt(scanner.nextLine());
            switch (optionCustomer) {
                case 1:
                    List<Customer> customers = this.customerController.getCustomer();
                    for (Customer c : customers) {
                        System.out.println(c);
                    }
                    break;
                case 2:
                    Customer newCustomer = new Customer();
                    customerController.createCustomer(newCustomer);
                    break;
                case 3:
                    customerController.updateCustomer(inputIdCustomer(),createCustomer());
                    break;
                case 4:
                    customerController.deleteCustomer(inputIdCustomer());
                    break;
                case 5:
                    for (Customer c : customerController.searchCustomer(inputNameCustomer())){
                        System.out.println(c);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Tam biet!");
            }
        } while (optionCustomer != 6);
    }

    public static void customerManagement() {
        System.out.println("===Customer Management===");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
        System.out.println("---------------------------");
        System.out.println("Nhap lua chon cua ban theo so: ");
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        System.out.println("Nhap id Khach hang: ");
        String id = scanner.nextLine();
        while (!Regex.regexIdCustomer(id)) {
            System.out.println("Id ban nhap khong hop le");
            id = scanner.next();
        }
        customer.setId(id);
        System.out.println("Nhap name Khach hang: ");
        String name = scanner.nextLine();
        while (!Regex.CheckNameEmployee(name)) {
            System.out.println("Name ban nhap khong hop le");
            name = scanner.next();
        }
        customer.setName(name);
        System.out.println("Nhập ngay sinh khach hang: ");
        String birthDay = scanner.nextLine();
        while (!Regex.calculateAgeWithJodaTime(Regex.covertStringToDate(birthDay))) {
            System.out.println("Ban chua du tuoi!");
            birthDay = scanner.next();
        }
        customer.setBirthDay(birthDay);
        System.out.println("Nhap gioi tinh cua ban: ");
        String sex = scanner.nextLine();
        customer.setSex(sex);
        System.out.println("Nhap CMND cua ban: ");
        String idCard = scanner.nextLine();
        while (!Regex.regexIdCardEmployee(idCard)) {
            System.out.println("Id card cua ban khong hop le!");
            idCard = scanner.next();
        }
        customer.setIdentityCard(idCard);
        System.out.println("Nhap so dien thoai cua ban: ");
        String phone = scanner.nextLine();
        while (!Regex.regexPhoneNumberEmployee(phone)) {
            System.out.println("So dien thoai khong hop le!");
            phone = scanner.next();
        }
        customer.setPhone(phone);
        System.out.println("Nhap email cua ban:");
        String email = scanner.nextLine();
        customer.setEmail(email);
        System.out.println("Nhap trinh đo cua ban theo so thu tu: ");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao dang ");
        System.out.println("3. Dai hoc ");
        System.out.println("4. Sau dai hoc ");
        System.out.println("------------------------");
        String customerType = null;
        int level;
        do {
            level = Integer.parseInt(scanner.nextLine());
        } while (level != 5);
        switch (level) {
            case 1 -> customerType = "Diamond";
            case 2 -> customerType = "Platinum";
            case 3 -> customerType = "Gold";
            case 4 -> customerType = "Silver";
            case 5 -> customerType = "Member";
        }
        customer.setCustomerType(customerType);
        System.out.println("Nhap dia chi khach hang:");
        String address = scanner.nextLine();
        customer.setAddress(address);
        return customer;
    }

    public String inputIdCustomer(){
        String string;
        do {
            System.out.println("Nhap id khach hang muon tiem kiem");
            string = scanner.nextLine();
        }while (!Regex.regexIdCustomer(string));
        return string;
    }
    public String inputNameCustomer(){
        String name;
        do {
            System.out.println("Nhap name muon tiem kiem");
            name = scanner.nextLine();
        }while (!Regex.CheckNameEmployee(name));
        return name;
    }
}
