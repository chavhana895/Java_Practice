
public class loop {

	public static void main(String[] args) 
	{
		/*loopi(0);
	}

	private static void loopi(int i) 
	{
		if(i<6)
		{  loopj(i,0);
			System.out.println();
			i++;
			loopi(i);
		}
			
	}

	private static void loopj(int i, int j) 
	{
		if(j<6)
		{
			if(j-i<=0)
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			loopj(i, j);
		}*/
		
		
		
		
		loopi(0);
		
	}

	private static void loopi(int i) 
	{
		if(i<6)
		{
			loopj(i,0);
			System.out.println();
			i++;
			loopi(i);
		}
	
	}

	private static void loopj(int i, int j) 
	{
	  if(j<6)
	  {
		  if(j-i<=0)
			  System.out.print("*");
		  else
			  System.out.print(" ");
		  j++;
		  loopj(i, j);
	  }
	}

}
