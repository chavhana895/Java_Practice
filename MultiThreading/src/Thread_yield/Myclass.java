package Thread_yield;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyThreadOne one=new MyThreadOne();
	  MyThreadTwo two=new MyThreadTwo();
	 one.start();
	 System.out.println("I am here");
	two.run();
	}

}
