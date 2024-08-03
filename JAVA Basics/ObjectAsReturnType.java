package chapter1;

public class ObjectAsReturnType {

	public static void main(String[] args) {
		
		Customer customer1 = getCustomer();
		customer1.showCustomerData();
	}
	
	public static Customer getCustomer() {
		
		Customer customer = new Customer();
		customer.customer_id="C-3";
		customer.customer_name="GHI";
		customer.email = "ghi@gmail.com";
		
		return customer;
				
	}
}
