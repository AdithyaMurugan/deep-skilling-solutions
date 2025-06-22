package DependencyInjection;

public class CustomerApp {
	public static void main(String[] args) {
        
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.getCustomerDetails("CUST102");
    }
}
