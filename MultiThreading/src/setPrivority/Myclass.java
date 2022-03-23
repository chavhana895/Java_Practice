package setPrivority;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyThreadOne one=new MyThreadOne();
	  MyThreadTwo two=new MyThreadTwo();
	 // one.setPriority(1);
	  //max priority=10;  min=1, average=5
	  one.setDaemon(true);
	  System.out.println(one.getPriority());
	}

}
