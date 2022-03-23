package deadLock;

public class Myclass {

	public static void main(String[] args) 
	{
            blueThread t1=new blueThread();
            redThread  t2 = new redThread();
            t1.start();
            t2.start();
	}

}
