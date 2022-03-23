package Ques_02_Hi_Hello;

public class Class {

	static boolean status=true;
	
	public static synchronized void hi() {
		if(status==true) {
			System.out.println("hi");
			status=false;
		}
	}

	public static synchronized void hello() {
		if(status==false) {
			System.out.println("How are you?");
			status=true;
		}
	}

}
