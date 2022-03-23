package Ques_04;

public class MyClass {

	public static void main(String[] args) {
		
		Box box= new Box();
		
		Thread1 t1=new Thread1(box);
		Thread2 t2=new Thread2(box);
		t1.start();
		t2.start();
	}

}
