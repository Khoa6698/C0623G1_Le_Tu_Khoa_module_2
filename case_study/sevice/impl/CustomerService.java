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
        return this.customerRepository.getCustomer();
    }

    @Override
    public void createCustomer(Customer customer) {
        this.customerRepository.createCustomer(customer);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        this.customerRepository.updateCustomer(id,customer);
    }

    @Override
    public void deleteCustomer(String id) {
        this.customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return this.customerRepository.searchCustomer(name);
    }
}
