package synchronized_Method;

public class Myclass {

	public static void main(String[] args) throws Exception 
	{
	   Thread1 t1 = new Thread1();
	   Thread2 t2 = new Thread2();
	   t1.start();
	   t2.start();
	   
	   t1.join();
	   t2.join();
	   
	   System.out.println(Addition.i);
	}

}
