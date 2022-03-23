package MultiThreading;

public class Class2 {
public synchronized void Method1(Class1 class1) 
{ System.out.println("I am in class2 Method1");
  try {Thread.sleep(100);
} catch (Exception e) {}	
  class1.Method2();
}

public void Method2() {
	System.out.println("I am in class2 Method2");
	
}
}
