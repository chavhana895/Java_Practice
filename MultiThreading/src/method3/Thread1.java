package method3;

public class Thread1 extends Thread{
public void run() {
	Abcd abcdkaobjforT1=Abcd.abcdka1obj;
	for (int i = 0; i < 1000000; i++) {
		abcdkaobjforT1.add();
	}
}
}
