package case_study.repository.impl;

import case_study.model.entity.customer.Customer;
import case_study.repository.ICustomerRepository;
import ss16_binary_file_serialization.bai_tap.product_management.utils.ReaderAndWriter;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_PATHNAME = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\case_study\\data\\customer.csv";
    private final String COMMA = ",";

    @Override
    public List<Customer> getCustomer() {
        List<String> customerString = ReaderAndWriter.reader(CUSTOMER_PATHNAME);
        List<Customer> customerList = new ArrayList<>();
        String[] array;
        for (String p : customerString){
            array = p.split(",");
            customerList.add(new Customer(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]));
        }
        return customerList;
    }

    @Override
    public void createCustomer(Customer customer) {
        List<Customer> customerList = this.getCustomer();
        customerList.add(customer);
        ReaderAndWriter.writer(CUSTOMER_PATHNAME,this.convertToString(customerList));
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        List<Customer> customerList = this.getCustomer();
        int index;
        for (Customer c : customerList){
            if(c.getId().equals(id)){
                index = customerList.indexOf(c);
                customerList.set(index,customer);
            }
        }
        ReaderAndWriter.writer(CUSTOMER_PATHNAME,this.convertToString(customerList));
    }

    @Override
    public void deleteCustomer(String id) {
        List<Customer> customerList = this.getCustomer();
        for (Customer c : customerList){
            if(c.getId().equals(id)){
                customerList.remove(c);
            }
        }
        ReaderAndWriter.writer(CUSTOMER_PATHNAME,this.convertToString(customerList));
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = this.getCustomer();
        List<Customer> customers = new ArrayList<>();
        for (Customer c : customerList){
            if(c.getName().contains(name)){
                customers.add(c);
            }
        }
        return customers;
    }

    private List<String> convertToString(List<Customer> customerList){
        List<String> strings = new ArrayList<>();
        for (Customer c : customerList){
            strings.add(c.getId()+COMMA+c.getName()
                    +COMMA+c.getBirthDay()+COMMA+c.isSex()
                    +COMMA+c.getIdentityCard()+COMMA+c.getPhone()
                    +COMMA+c.getEmail()+COMMA+c.getCustomerType()+COMMA+c.getAddress());
        }
        return strings;
    }
}
