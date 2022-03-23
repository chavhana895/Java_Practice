package methd2;

public class Thread2 extends Thread {
	Abcd abcd;
	public Thread2(Abcd abcd)
	{
		this.abcd=abcd;
		
	}
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			abcd.add();
		}
	}
}
