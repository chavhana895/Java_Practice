package methd2;

public class Thread1 extends Thread{
Abcd abcd;
public Thread1(Abcd abcd)
{
	this.abcd=abcd;
	
}
public void run() {
	for (int i = 0; i < 1000000; i++) {
		abcd.add();
	}
}
}
