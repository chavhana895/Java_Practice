package Ques_02_Hi_Hello;

public class Thread1 extends Thread {

	@Override
	public void run() {
		while(true) {
			Class.hi();
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
	
}
