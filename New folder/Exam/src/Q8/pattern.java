package Q8;

public class pattern {

	public static void main(String[] args)
	{
		int cnt=4;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(j+i>3)
				{
				  if(i<5)	
				  {
				  System.out.print((i+1)+" ");
				  }
//				  else if(i>4)
//				  {
//					  
//					  System.out.print((i-1)+" ");	
//				  }
				}
				  else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int i = 4; i >=1; i--) 
		{
			for (int j = 0; j < 4; j++)
			{
				if(j+i>3)	
				
				  System.out.print(" "+i);
				else 
					System.out.print(" ");
		
			}
			System.out.println();
		}
    }
}
