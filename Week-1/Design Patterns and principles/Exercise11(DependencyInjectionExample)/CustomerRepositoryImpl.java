package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // In a real application, this would fetch data from a database
        if ("123".equals(id)) {
            return "John Doe";
        } else if ("456".equals(id)) {
            return "Jane Smith";
        } else {
            return "Customer not found";
        }
    }
} 