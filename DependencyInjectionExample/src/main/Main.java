package main;

import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;
import model.Customer;

public class Main {
    public static void main(String[] args) {
        
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

       
        CustomerService customerService = new CustomerService(customerRepository);

        
        Customer customer = customerService.getCustomerById(1);
        System.out.println(customer);
    }
}
