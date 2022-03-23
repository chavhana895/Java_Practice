package Thread2ndWay;

public class Myclass 
{

	public static void main(String[] args) 
	{
		MyThread myThread=new MyThread();
		Thread thread = new Thread (myThread);
		thread.start();
	}
}