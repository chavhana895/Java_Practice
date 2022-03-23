package implimentRunnable;

public class Myclass {

	public static void main(String[] args) 
	{
        Thread1 thread1 = new Thread1();
        Thread thread=new Thread(thread1);
        thread.start();
	}

}
