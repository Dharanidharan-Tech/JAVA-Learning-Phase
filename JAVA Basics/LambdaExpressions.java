package chapter1;

//Lambda Expressions support functional interface only

public class LambdaExpressions {

	public static void main(String[] str) {
		
		Lambda1 ld1 = (name,emailid) -> {
			
			System.out.println(name);
			System.out.println(emailid);
		};
		
		ld1.display1("abc","abc@gmail.com");
	}
}

//class LambdaExpressions end

interface Lambda1 {
	
	public void display1(String name , String emailid);
}
