package deadlock1;

public class Thread1 extends Thread {
Class1 class1;
Class2 class2;

public Thread1(Class1 class1, Class2 class2) 
{
	this.class1 = class1;
	this.class2 = class2;
}
@Override
	public void run() {
class1.method1(class2);
}
}
