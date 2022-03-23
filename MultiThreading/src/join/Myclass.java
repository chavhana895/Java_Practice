package join;

public class Myclass {

	public static void main(String[] args) throws Exception 
	{
	  MyThreadOne one=new MyThreadOne();
	  MyThreadTwo two=new MyThreadTwo();
	  one.start();
	  two.start();
	  one.join();
	  two.join();
	  System.out.println("My work is done");
	}
}