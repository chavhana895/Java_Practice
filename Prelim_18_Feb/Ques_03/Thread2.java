package Ques_03;

public class Thread2 extends Thread {

Box box;
	
	public Thread2(Box box) {
		this.box=box;
	}
	
	@Override
	public void run() {
		while(true) {
			box.prduser();
			try { Thread.sleep(10); }catch (Exception e) {}
		}
		
	}
	
}
