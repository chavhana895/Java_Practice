package sidebySideExecution;

public class Myclass {
public static void main(String[] args) 
{
	Mythread myThread=new Mythread();
	myThread.start();
	for (int i = 0; i < 100; i++) 
	{
		System.out.println("Hello From main thread");
		try {
			Thread.sleep(100);
		    } catch ( Exception e) {}
	}
}
}
