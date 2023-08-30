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
                    Customer newCustomer = createCustomer();
                    customerController.createCustomer(newCustomer);
                    System.out.println("Successfully added new");
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
                    System.out.println("Goodbye!");
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
        System.out.println("Select method by number: ");
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter id customer: ");
        String id = scanner.nextLine();
        while (Regex.regexIdCustomer(id)) {
            System.out.println("The id you entered is not valid! ");
            id = scanner.next();
        }
        customer.setId(id);
        System.out.println("Enter name customer: ");
        String name = scanner.nextLine();
        while (Regex.CheckName(name)) {
            System.out.println("The name you enteredisis not valid!");
            name = scanner.next();
        }
        customer.setName(name);
        System.out.println("Enter birthday customer: ");
        String birthDay = scanner.nextLine();
        while (Regex.calculateAgeWithJodaTime(Regex.covertStringToDate(birthDay))) {
            System.out.println("You are not old enough!");
            birthDay = scanner.next();
        }
        customer.setBirthDay(birthDay);
        System.out.println("Enter your gender: ");
        String sex = scanner.nextLine();
        customer.setSex(sex);
        System.out.println("Enter ID card customer: ");
        String idCard = scanner.nextLine();
        while (Regex.regexIdCard(idCard)) {
            System.out.println("The ID card you entered is not valid!!");
            idCard = scanner.next();
        }
        customer.setIdentityCard(idCard);
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        while (Regex.regexPhoneNumberEmployee(phone)) {
            System.out.println("The number phone you entered is not valid!");
            phone = scanner.next();
        }
        customer.setPhone(phone);
        System.out.println("Enter gmail customer:");
        String email = scanner.nextLine();
        while (Regex.gmailRegex(email)){
            System.out.println("Email is not valid!");
            email = scanner.next();
        }
        customer.setEmail(email);
        System.out.println("Type of Customer includes: ");
        System.out.println("1. Diamond");
        System.out.println("2. Platinum ");
        System.out.println("3. Gold ");
        System.out.println("4. Silver ");
        System.out.println("5. Member ");
        System.out.println("------------------------");
        String customerType = null;
        int level;
        do {
            level = Integer.parseInt(scanner.nextLine());
        } while (level <= 0||level>5);
        switch (level) {
            case 1 -> customerType = "Diamond";
            case 2 -> customerType = "Platinum";
            case 3 -> customerType = "Gold";
            case 4 -> customerType = "Silver";
            case 5 -> customerType = "Member";
        }
        customer.setCustomerType(customerType);
        System.out.println("Enter customer address:");
        String address = scanner.nextLine();
        customer.setAddress(address);
        return customer;
    }

    public String inputIdCustomer(){
        String string;
        do {
            System.out.println("Enter the customer id you want to search: ");
            string = scanner.nextLine();
        }while (Regex.regexIdCustomer(string));
        return string;
    }
    public String inputNameCustomer(){
        String name;
        do {
            System.out.println("Enter the customer name is you want to search: ");
            name = scanner.nextLine();
        }while (Regex.CheckName(name));
        return name;
    }
}
