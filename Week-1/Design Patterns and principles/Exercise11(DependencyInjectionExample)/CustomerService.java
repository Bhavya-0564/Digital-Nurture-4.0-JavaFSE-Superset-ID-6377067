package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(String id) {
        System.out.println("Fetching customer details for ID: " + id);
        return customerRepository.findCustomerById(id);
    }
} 