package StarAssignment10;

public class five {

	public static void main(String[] args) 
	{
	  int i=0,j=0;
	  starFive(i,j);
	}

	private static void starFive(int i, int j) 
	{
	   if(i<9)
	   {
		   if(j+i<=4 || i-j>=4)
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
		   starFive(i, j);
	   }
	}

}
