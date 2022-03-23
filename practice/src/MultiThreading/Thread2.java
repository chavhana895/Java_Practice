package MultiThreading;

public class Thread2 extends Thread {
Class1 class1;
Class2 class2;
public Thread2(Class1 class1, Class2 class2) {
	super();
	this.class1 = class1;
	this.class2 = class2;
}
@Override
	public void run() {
		class2.Method1(class1);
	}
}
