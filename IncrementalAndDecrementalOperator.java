package JavaTraining;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {
		//++ inc value by 1
		//-- dec value 1
		
		int a = 1; //a = 1
		int b = a++; //post increment,  
		
		System.out.println(a);
		System.out.println(b);
		
		int h = -4;
		int g = h++;
		System.out.println(h);
		System.out.println(g);
		
		int p = 1;
		int q = ++p;  //pre increment 
		System.out.println(p);
		System.out.println(q);
		
		int m = 2;
		int n = m--;
		System.out.println(m);
		System.out.println(n);
		
		int c = -3;
		int d = --c; //pre decrement
		
		System.out.println(c);
		System.out.println(d);
		
		int t1 = -99;
		int t2 = t1--; //post decrement 
		
		System.out.println(t1); //-100
		System.out.println(t2); //-99
		
		int r = 10;
		
		int p1 = r++ +10;
		System.out.println(r);
		System.out.println(p1);		
		
		
		

	}

}
