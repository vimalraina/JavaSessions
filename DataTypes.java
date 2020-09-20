package JavaTraining;

public class DataTypes {

	public static void main(String[] args) {

		// data types:
		  // 1. non primitive data types: String, Array
		  // 2. primitive data types:
		     // a. Boolean : true false
		    // b. Numeric :
		       // 1. Character : char
		       // 2. Integral : byte short int long
		          // 2.1: floating point : float, double

		// byte 1 byte = 8 bits ;
		// range -128 to 127
		byte b = 100;
		System.out.println(b);

		// SHORT -32,768 .. 32,767
		// 2 bytes = 16 bit

		short s = 12127;

		// int -2,147,483,648 .. 2,147,483,647
		// 4 bytes = 32 bit

		int i = 10;
		System.out.println(i);

		int i1 = 's';
		System.out.println(i1); // will print asci value

		// long -9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
		// 8 byte = 64 bit
		//

		// float , 8 digits after decimal
		// 4 bytes
		// should be suffixed by 'f' or prefixed by '(float)'
		float f = 123.12f;
		float f1 = (float) 12312.12345678;
		float f2 = 100f;

		System.out.println("f2");

		// double 15 digits after decimal
		// 8 bytes
		double d = 123.000;
		System.out.println(d);

		// charter
		// can store any character , only one character
		char c1 = 'a';
		char c2 = '$';
		System.out.println(c1);

		// boolean true , false
		boolean flag = false;
		System.out.println(flag);
		if (flag) {
			System.out.println("raina");
		}

	}

}
