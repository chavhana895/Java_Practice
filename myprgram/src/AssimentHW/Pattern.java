package AssimentHW;


public class Pattern {
	
	public static void main(String[] args)
	{
		int c=1;
		for (int i = 1; i <=5; i++)
		{
			if(i%2==0)	
				c++;
			for (int j = 0; j <=6; j++)
			{
				if(j-i<=0)//
				{
					if(i%2==0)
						System.out.print("*");
					else
						System.out.print(c);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");	
		}
	}
}
