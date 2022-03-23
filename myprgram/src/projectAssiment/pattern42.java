package projectAssiment;

public class pattern42 {

	public static void main(String[] args) 
	{
		for(int i=0;i<9;i++)
		{
			int k=1;
			for(int j=0;j<5;j++)
			{
				
				if(j+i>=8) 
					System.out.print(k++ +" ");   //j+3
				else
				{
					System.out.print(" ");
					k++;
				}
				
			}
			System.out.println();

		}


	}

}
