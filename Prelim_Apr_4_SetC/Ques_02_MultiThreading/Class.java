package Ques_02_MultiThreading;

public class Class {

	static boolean print = true;

	public static synchronized void m1() {
		if (print) {
			System.out.println("hi");
			print=false;
		}
	}

	public static synchronized void m2() {
		if(!print) {
		System.out.println("How are you?");
		print=true;
		}
	}

}
