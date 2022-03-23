package Exception_Practice;
public class mainclass3_HW3 {

	public static void main(String[] args)
	{
		MyThread_one one =new MyThread_one();
		MyThread_two two=new MyThread_two();
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


class MyThread_one extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) {}
		}
	}
}
class MyThread_two  extends Thread
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
