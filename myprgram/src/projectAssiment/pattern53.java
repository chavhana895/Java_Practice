package projectAssiment;

public class pattern53 {

	public static void main(String[] args)
	{
		
		for(int i=1;i<9;i++)
		{
			int k=1;
			for(int j=0;j<=9;j++)
			{
				if(j+i>9 ) 
					System.out.print(k+++" ");
				else
					System.out.print(" ");
			}	
			System.out.println();

		}


	}

}
