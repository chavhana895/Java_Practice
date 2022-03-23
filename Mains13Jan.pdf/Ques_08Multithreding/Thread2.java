package Ques_08Multithreding;

public class Thread2 extends Thread {

	@Override
	public void run() {
		while(true) {
			print.odd();
			try { Thread.sleep(10); } catch (Exception e) {}
		}
	}
	
}
