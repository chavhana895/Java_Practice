package StarAssignment10;

public class nine {

	public static void main(String[] args) {
		

		int i=0,j=0;
		generateNumber(i,j);

	}

	private static void generateNumber(int i, int j) 
	{ 
	 if(i<8)
	  {
		 if(j==0 && i==7 ||(j==4 && i==7))
				System.out.print(" ");
		else if(j==0 || j==4 || i==7 )
			System.out.print("*");
		
		
		else
			System.out.print(" ");
		if(j<4)
			j++;
		else if(j==4)
		{
			j=0; i++;
			System.out.println();
		}
		generateNumber(i, j);
	  }

	}

}
