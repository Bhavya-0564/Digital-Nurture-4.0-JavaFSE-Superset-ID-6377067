package DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the concrete repository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service using constructor injection
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find customers
        System.out.println("Customer 123: " + customerService.getCustomerDetails("123"));
        System.out.println("\n---\n");
        System.out.println("Customer 456: " + customerService.getCustomerDetails("456"));
        System.out.println("\n---\n");
        System.out.println("Customer 789: " + customerService.getCustomerDetails("789"));
    }
} 