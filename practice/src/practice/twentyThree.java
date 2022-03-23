package practice;

public class twentyThree {

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if((j-i>=0 && j-i<=4 && i<5)|| (i+j>=8 && i+j<=12 && i>4))
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		}

}
