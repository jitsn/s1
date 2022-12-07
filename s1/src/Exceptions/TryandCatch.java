package Exceptions;

public class TryandCatch {
	public static void main(String[]args) {
		
	
	int a=20;
	int b=0;
	int c;
	int r[]= {1,4,5,4,3,2};
	try {
		
	c=a/b;
	System.out.println(r[6]);
	}
	catch(ArithmeticException h) {
		System.out.println("catch arithmatic exception");
	}
	catch(ArrayIndexOutOfBoundsException h) {
		System.out.println("catch arrayindexoutofbound exception");
		try {
			c=a/b;
		}
		catch(ArithmeticException u) {
			System.out.println("arithmatic exception");
		}
	}
	
	System.out.println("rest code");
}

	
}