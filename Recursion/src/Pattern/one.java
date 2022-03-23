package Pattern;

public class one {

	public static void main(String[] args) 
	{
	  int i=0,j=0;
	  pattern(i,j);
	}

	private static void pattern(int i, int j) 
	{
		if(i<5)
		{
			if(j<5)
				System.out.print("*");
			else
				System.out.print(" ");
		
		    if(j<5)
			   j++;
		    else if(j==5)
		     {
		    	j=0;
		    	i++;
		    	System.out.println();
		    }
		  pattern(i, j);
		}
	}

}
