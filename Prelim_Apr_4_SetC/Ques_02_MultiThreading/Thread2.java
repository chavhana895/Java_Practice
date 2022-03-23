package Ques_02_MultiThreading;

public class Thread2 extends Thread {

	@Override
	public void run() {

		while (true) {
			Class.m2();
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}

	}

}
