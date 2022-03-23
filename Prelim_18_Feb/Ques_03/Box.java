package Ques_03;

public class Box {

	int stock = 10;

	public synchronized void cunsumer() {
		if (stock < 11) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		stock--;
		System.out.println(stock);
		if (stock < 11) {
			notify();
		}
	}

	public synchronized void prduser() {
		if (stock > 19) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		stock++;
		System.out.println(stock);
		
		if(stock>18) {
			notify();
		}
	}

}
