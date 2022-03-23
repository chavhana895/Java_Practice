package projectAssiment;

public class pattern51 {

	public static void main(String[] args)
	{
	/*	int k=9;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && i<5)
				{
					System.out.print(1+i+" ");
				}
				else if( j-i>=-4 && i>4) 
					System.out.print(k-i+" ");
				else
					System.out.print("-");
			}
			
			System.out.println();
		} /*/
		int counter=1;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=-4)
					System.out.print(counter+" ");
				else
					System.out.print("-");
			}
			if(i<4)
				counter++;
			else
				counter--;
			System.out.println();
		}
	}
	

}
