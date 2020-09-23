package JavaTraining;

public class StringMerge {

	public static void main(String[] args) {
		
		//String non-priitive data type
		
		String  a = "HelloWorld";
		
		String  b = "Selenium";
		
		System.out.println(a+b);
		
		int x = 100;
		int  y = 200;
		double d = 100.123;
		
		System.out.println(x+y);
		
		System.out.println(a+x);
		System.out.println(a+x+y);
		System.out.println(x+y+d+a+x+y+d);
		
		String tax  = "test";
		int income  = 300;
		System.out.println("my tax is"+tax);
		System.out.println("my tax and income is : "+ (tax+income));
		
		System.out.println("hello"+" "+"world"+'t');
		

	}

}
