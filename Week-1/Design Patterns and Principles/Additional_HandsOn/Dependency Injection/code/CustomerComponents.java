package DependencyInjection;

interface CustomerRepository {
    String findCustomerById(String id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
       
        return "Customer[ID: " + id + ", Name: Adithya M, Email: adithya@example.com]";
    }
}


class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String customerId) {
        String customer = repository.findCustomerById(customerId);
        System.out.println("Fetched from repository: " + customer);
    }
}