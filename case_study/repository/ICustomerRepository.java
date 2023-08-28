package case_study.repository;

import case_study.model.entity.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getCustomer();
    void createCustomer(Customer customer);
    void updateCustomer(String id, Customer customer);
    void deleteCustomer(String id);
    List<Customer> searchCustomer(String name);
}
