package case_study.sevice.impl;

import case_study.model.entity.customer.Customer;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.sevice.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static final ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> getCustomer() {
        return customerRepository.getCustomer();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        customerRepository.updateCustomer(id,customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return customerRepository.searchCustomer(name);
    }
}
