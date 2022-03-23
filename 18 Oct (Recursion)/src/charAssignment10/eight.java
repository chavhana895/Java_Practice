package charAssignment10;

public class eight {

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
					System.out.print((char)(65+5-j-i));
				else if(j-i<=-6)
					System.out.print((char)(-6-j+i+65));

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
