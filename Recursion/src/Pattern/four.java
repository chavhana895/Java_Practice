package Pattern;

public class four {

	public static void main(String[] args) 
	{
	 pattern(0,0);
	}

	private static void pattern(int i, int j) 
	{
	  if(i<9)
	  {
		  if(j-i<=0 && j+i<=8)
			  System.out.print("*");
		  else
			  System.out.print(" ");
		  if(j<5)
			  j++;
		  else if(j==5)
		  {
			  j=0;i++;
			  System.out.println();
		  }
		  pattern(i, j);
	  }
	}

}
