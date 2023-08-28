package case_study.controller;

import case_study.model.entity.customer.Customer;
import case_study.sevice.ICustomerService;
import case_study.sevice.impl.CustomerService;

import java.util.List;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();

    public List<Customer> getCustomer() {
        return this.customerService.getCustomer();
    }

    public void createCustomer(Customer customer) {
        this.customerService.createCustomer(customer);
    }

    public void updateCustomer(String id, Customer customer) {
        this.customerService.updateCustomer(id, customer);
    }

    public void deleteCustomer(String id) {
        this.customerService.deleteCustomer(id);
    }

    public List<Customer> searchCustomer(String name) {
        return this.customerService.searchCustomer(name);
    }
}
