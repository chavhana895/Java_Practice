package method3;

public class Thread2 extends Thread {
@Override
public void run() {
	Abcd abcdkaobjforT2=Abcd.abcdka1obj;
	for (int i = 0; i < 1000000; i++) {
		abcdkaobjforT2.add();
}
}
}