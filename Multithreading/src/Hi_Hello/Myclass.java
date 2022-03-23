package Hi_Hello;

public class Myclass {

	public static void main(String[] args) 
	{
	   Class1 class1 = new Class1();
	   Thread1 t1 = new Thread1(class1);
	   Thread2 t2 = new Thread2(class1);
	   t1.start();
	   t2.start();
	}
}