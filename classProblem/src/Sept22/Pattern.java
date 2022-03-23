package Sept22;

public class Pattern {

	public static void main(String[] args) {
		/*for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && i<5)
					System.out.print(i+1+" ");
				else if(j-i>=-4&&i>4)
					System.out.print(9-i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/



/*for(int i=0;i<9;i++)
{
	for(int j=0;j<5;j++)
	{
		if(j+i>=4 && i<5)
			System.out.print(i+1);
		else if(j-i>=-4&&i>4)
			System.out.print(9-i);
		else
			System.out.print(" ");
	}
	System.out.println();
}*/
		
		/*int counter=1;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=4)
					System.out.print(counter);
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<4)
				counter++;
			else
				counter--;
		}*/
		
		
		
		/*for(int i=0; i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<5;i++)           //71
		{ int counter=1;
			for(int j=0;j<9;j++)
			{
				if(j<=2*i)
					System.out.print(counter);
				else 
					System.out.print(" ");
				if(j-i<0)
					counter++;
				else
					counter--;
		}
			System.out.println();
	}*/
		
	
		/*for(int i=0;i<5;i++)                        //75
		{
			for(int j=0;j<9;j++)
			{
				if(j-i==0)
					System.out.print(" ");
				else if(j<=2*i)
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
		}*/
		 
		
		/*for(int i=0;i<4;i++)      //75
		{
			for(int j=0;j<4;j++)
			{
				if(j-i<=0)
					System.out.print("*");
			}
			System.out.print(" ");
			
			for(int j=0;j<4;j++)
			{
				if(j-i<=0)
					System.out.print("*");
			}
			System.out.println();
			}*/
		
		
		
		}
}

