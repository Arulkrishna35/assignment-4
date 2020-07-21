
public class TestCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("John");
		Address address = new Address("Ist main HSR layout","Bangalore");
		System.out.println(customer.getCustomerName());
		System.out.println(address.getAddressDetails());
		Customer customer1 = new Customer("johnson","Ist main HSR layout","Bangalore");
		System.out.println(customer1.getCustomerDetails());
	}
}