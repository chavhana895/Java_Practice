package Ques_02_MultiThreading;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();
		
	}

}
