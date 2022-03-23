package projectAssiment;

public class pattern71 {

	public static void main(String[] args) 
	{ 
		
		for(int i=0;i<5;i++)
		{
			int counter=1;
			for(int j=0;j<9;j++)
			{
				
				if(j<=2*i) 
					System.out.print(counter);
				else
					System.out.print("-");
				if(j+i<0)
					counter++;
				else
					counter--;
			}
			 
			System.out.println();
		}
		System.out.println("+secnod logic-------------");
		int mid_Point=0;
		for(int i=0;i<9;i=i+2)
		{
			int count1=1;
			for(int j=0;j<9;j++)
			{
				if(j-i<=0 )
				{
					if(j<mid_Point)
						System.out.print(count1++);
					else
						System.out.print(count1--);
				}
				
			}
			System.out.println();
			mid_Point++;
		}
	}

}
