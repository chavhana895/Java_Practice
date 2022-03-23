package Exception_Practice;


public class hw6 {

	public static void main(String[] args) {
		MyThreadone1 one =new MyThreadone1();
		MyThreadtwo1 two=new MyThreadtwo1();
	
		one.start();
		two.start();
	}

}
class MyThreadone1 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			Thread.yield();
			System.out.println("One_hello");

		}
	}
}
class MyThreadtwo1  extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("java thir class");
			
		}
	}

}

