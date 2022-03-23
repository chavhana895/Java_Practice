package NumberAssignment10;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=0,j=0;
	      generateNumber(i,j);
	      
		}

		private static void generateNumber(int i, int j) 
		{
		  if(i<5)
		  {
			  if(j-i<=0)
					System.out.print(j+1);
			  else
				  System.out.print(" ");
			  if(j<4)
				  j++;
			  else if(j==4)
			  {
				  j=0;i++;
				  System.out.println();
			  }
			  generateNumber(i, j);
		  }
	}

}
