package starPattern;

public class NewPattern {

	public static void main(String[] args)
	{
	   for (int i = 0; i < 9; i++)
	   {
		 for (int j = 0; j < 9; j++)
		 {
			if(j>4 && i<4 || j<4 && i>4)
				System.out.print("*");
			else if(j==4 && i<4 || j==4 && i>4)
				System.out.print("|");
			else if(i==4 && j<4 || i==4 && j>4)
				System.out.print("-");
			else if(i==4 && j==4)
				System.out.print("+"+"");
			else
				System.out.print(" ");
		 }
		 System.out.println();
	   }
	}

}
