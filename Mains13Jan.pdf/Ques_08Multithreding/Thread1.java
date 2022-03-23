package Ques_08Multithreding;

public class Thread1 extends Thread {

	@Override
	public void run() {
		
		while(true) {
			print.even();
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
	}
	
}
