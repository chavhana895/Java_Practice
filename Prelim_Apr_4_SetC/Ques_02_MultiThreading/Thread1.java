package Ques_02_MultiThreading;

public class Thread1 extends Thread {

	@Override
	public void run() {

		while (true) {
			Class.m1();
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}

}
