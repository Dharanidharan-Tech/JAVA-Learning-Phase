package chapter1;

public class TightlyCoupled {

	String book_name;
	
	public void setBookName() {
		
		book_name = "The complete reference of Java";
	}
	
	public void displayBook() {
		
		System.out.println(book_name);
	}
}
