package chapter1;

public class Product {

	private String product_name;
	private double price;
	
	//Setter Methods
	
	public void setProductName(String product_name1) {
		
		product_name = product_name1;
	}
	
	public void setPrice(double price1) {
		
		price = price1;
	}
	
	//Getter Methods
	public String getProductName() {
		return product_name;
	}
	
	public double getPrice() {
		return price;
	}
}
