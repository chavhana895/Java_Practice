package Exception_Practice;

//import hw9.MyThreadone.MyThreadtwo;

//import hw9.MyThreadone.MyThreadtwo;

public class mainclass3_HW1 {

	public static void main(String[] args)
	{
		MyThreadone one =new MyThreadone();
		MyThreadtwo two=new MyThreadtwo();
		one.start();
		two.start();
		System.out.println("java world");
	}
}


class MyThreadone extends Thread
{
	public void run()
	{
		for (int i = 0; i < 50; i++)
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
class MyThreadtwo  extends Thread
{
	public void run()
	{
		for (int i = 0; i < 50; i++)
		{
			System.out.println("java");
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) {}
		}
	}

}
