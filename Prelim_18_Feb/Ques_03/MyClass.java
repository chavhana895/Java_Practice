package Ques_03;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		Thread1 t1=new Thread1(box);
		Thread2 t2=new Thread2(box);
		
		t1.start();
		t2.start();
	}

}
