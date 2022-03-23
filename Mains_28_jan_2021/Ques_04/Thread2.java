package Ques_04;

public class Thread2 extends Thread {

	Box box;
	public Thread2(Box box) {
		this.box=box;
	}
	
	@Override
	public void run() {
		while(true) {
			box.preduser();
			try { Thread.sleep(10); }catch (Exception e) {}
		}
	}
}
