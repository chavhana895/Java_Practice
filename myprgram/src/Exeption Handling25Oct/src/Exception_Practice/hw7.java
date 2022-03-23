package Exception_Practice;

public class hw7 {

	public static void main(String[] args) throws InterruptedException
	{
		
			MyThreadone11 one =new MyThreadone11();
			MyThreadtwo11 two=new MyThreadtwo11();
		
			one.start();
			two.start();
			one.join();
			two.join();
			System.out.println("move on java");
		}

	}
	class MyThreadone11 extends Thread
	{
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
			
				System.out.println("One_hello");

			}
		}
	}
	class MyThreadtwo11  extends Thread
	{
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
				System.out.println("java thir class");
				
			}
		}

	}

