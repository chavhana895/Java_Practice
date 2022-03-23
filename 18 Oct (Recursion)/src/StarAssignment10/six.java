package StarAssignment10;

public class six {

	public static void main(String[] args) 
	{
	  int i=0,j=0;
	  generateNumberr(i,j);
	}

	private static void generateNumberr(int i, int j) 
	{
	  if(i<5)
	  {
		  if(i+j>=4)
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
		  generateNumberr(i, j);
	  }
	}

}
