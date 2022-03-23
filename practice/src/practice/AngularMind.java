package practice;

public class AngularMind {

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{   if(j-i<=2)
		    	{
				if(i%2==0 )
					System.out.print(i+1);
				else if(i%2!=0 )
					System.out.print("*");
		    	}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
