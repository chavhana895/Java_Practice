package Ques_08Multithreding;

public class MyClass {

	public static void main(String[] args) {

//		8) Use two threads, One for printing even numbers and 
//		another for odd numbers. Output should be sequential eg. 
//		1,2,3,4,5,6,7,8,9. Output should be irrespective of sleep
//		time of threads, means if we change sleep time of any thread
//		to any number, output should be same

		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
	}

}
