package Ques_04;

public class Box {

	 int biscit=1;
	
	public synchronized void counsumer() {
		
		biscit--;
		System.out.println(biscit);
		if(biscit<10) {
			notify();
		}
	}
	
	public synchronized void preduser() {
		if(biscit>100) {
			try{wait();}catch (Exception e) {}
		}
		biscit++;
		System.out.println(biscit);
	}
	
}
