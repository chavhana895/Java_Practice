package synchronizedd;

public class Thread2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			Abcd.add();
		}
	}
}
