package Exceptions;

public class BasicException {
	
	static void demo() {
		 throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		//normal code
		System.out.println("hello");
		//you found exception in code
		demo();
		//because of exception it will not execute next code and will stop execution
		System.out.println("hi");
		//changes removed from this line to learn git process
		//again changes done to learn push changes made later
	}

}
