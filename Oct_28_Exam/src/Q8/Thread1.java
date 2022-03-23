package Q8;

public class Thread1 extends Thread {
Class1 class1;
Class2 class2;
public Thread1() {
	super();
	this.class1 = class1;
	this.class2 = class2;
}
public  void run() {
	class1.Method1(class2);
}
}
