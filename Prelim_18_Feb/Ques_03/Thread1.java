package Ques_03;

public class Thread1 extends Thread {

	Box box;
	
	public Thread1(Box box) {
		this.box=box;
	}
	
	@Override
	public void run() {
		while(true) {
			box.cunsumer();
			try { Thread.sleep(100); }catch (Exception e) {}
		}
		
	}
	
}
