package Ques;

public class Ques_8_ExceptionHandling {

	public static void main(String[] args) {
//		8. Write a program to display and check if checked exception
//		is propagating in a stack
		
		m1();
		
	}

	private static void m1() {
		System.out.println("In m1");
		m2();
		System.out.println("Out m1");
	}

	private static void m2() {
		System.out.println("In M2");
		int a;
		int b;
		System.out.println("Out M2");
	}

}
