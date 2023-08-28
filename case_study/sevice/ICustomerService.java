package case_study.sevice;

import case_study.model.entity.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomer();
    void createCustomer(Customer customer);
    void updateCustomer(String id,Customer customer);
    void deleteCustomer(String id);
    List<Customer> searchCustomer(String name);
}
