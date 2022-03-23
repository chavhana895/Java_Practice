package Ques_02_Hi_Hello;

public class Thread2 extends Thread {

	@Override
	public void run() {
		while (true) {
			Class.hello();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

}
