package hw9;

//import hw9.MyThreadone.MyThreadtwo;

//import hw9.MyThreadone.MyThreadtwo;

public class mainclass_HW5 {

	public static void main(String[] args)
	{
		MyThreadone one =new MyThreadone();
		MyThreadtwo two=new MyThreadtwo();
		one.setDaemon(true);
		one.setPriority(Thread.MAX_PRIORITY);
		two.setPriority(Thread.MIN_PRIORITY);
		System.out.println(one.getPriority());
		System.out.println(two.getPriority());
		one.start();
		two.start();
	//	System.out.println("java world");
	}
}


class MyThreadone extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("One_hello");
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) {}
		}
	}
}
class MyThreadtwo  extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("java thir class");
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) {}
		}
	}

}
