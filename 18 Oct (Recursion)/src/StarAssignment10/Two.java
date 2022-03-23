package StarAssignment10;

public class Two {

	public static void main(String[] args) {
	
		int i=0,j=0;
		
		starTwo(i,j);

	}

	private static void starTwo(int i, int j) 
	{
		if(i<5)
	  {
			
			if(i<5)
				System.out.print("*");
			else
				System.out.print(" ");
			if(j<4)
				j++;
			else if(j==4)
			{
				j=0;i++;
				System.out.println();
				
	     	}
			starTwo(i, j);

		}

	}

}
