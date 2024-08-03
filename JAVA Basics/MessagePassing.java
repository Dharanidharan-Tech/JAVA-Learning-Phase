package chapter1;

public class MessagePassing {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductName("Soap");
		product.setPrice(50.00);
		showProduct(product);
	}
	
	public static void showProduct(Product product1) {
		
		System.out.println(product1.getProductName());
		System.out.println(product1.getPrice());
	}
}
