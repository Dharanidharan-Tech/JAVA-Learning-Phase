package chapter1;

public class ObjectAsArguments {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.customer_id = "C-1";
		customer.customer_name="DEF";
		customer.email = "def@gmail.com";
		
		int x = 100;
		
		customerInfo(customer);
	}
	
	public static void customerInfo(Customer customer1) {
		
		customer1.showCustomerData();
	}
}

