package repository;

import model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        
        return new Customer(id, "John Doe");
    }
}
