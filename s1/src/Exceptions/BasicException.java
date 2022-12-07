package Exceptions;

public class BasicException {
	//to throw runtime exception we use this code
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
	}

}
