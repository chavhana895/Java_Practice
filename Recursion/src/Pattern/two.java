package Pattern;

public class two {

	public static void main(String[] args) 
	{
      int i=0,j=0;
      
      generateNo(i,j);
	}

	private static void generateNo(int i, int j) 
	{
	   if(i<5)
	   {
		   if(i+j<=4)
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
		   generateNo(i, j);
	   }
	}
}
