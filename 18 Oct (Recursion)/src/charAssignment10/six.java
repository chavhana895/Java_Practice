package charAssignment10;

public class six {

	public static void main(String[] args) 
	{
		 int i=0,j=0;
	      generateNumber(i,j);    
	}
		private static void generateNumber(int i, int j) 
		{
		  if(i<12)
		  {
			  if(j+i<=5)
					System.out.print((char)(65+j));
				else if(j-i<=-6)
					System.out.print((char)(65+j));
			  else
				  System.out.print(" ");
			  if(j<6)
				  j++;
			  else if(j==6)
			  {
				  j=0;i++;
				  System.out.println();
			  }
			  generateNumber(i, j);
		  }
	}

}
