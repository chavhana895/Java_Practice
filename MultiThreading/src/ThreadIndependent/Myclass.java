package ThreadIndependent;

public class Myclass {

	public static void main(String[] args) 
	{
		MyThreadOne one = new MyThreadOne();
		MyThreadTwo two=new MyThreadTwo();
		one.start();
		System.out.println("Hi, I am here");
				two.start();
	}

}
