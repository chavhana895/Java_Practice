package Q8;

public class Myclass {

	public static void main(String[] args)  {
		
		Class1 class1=new Class1();
		Class2 class2=new Class2();
		Thread1 t1=new Thread1();
		Thread t2=new Thread2();
		t1.start();
		t2.start();
		
	}

}
