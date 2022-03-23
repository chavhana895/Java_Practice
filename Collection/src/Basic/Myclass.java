package Basic;

public class Myclass {

	public static void main(String[] args) 
	{
	  ArraySizeGrow a = new ArraySizeGrow();
	  
	  for (int i = 0; i < 1000; i++) 
	  {
		a.add(100);
	  }
	
	  a.print();
	}

}
