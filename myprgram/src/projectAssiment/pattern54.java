package projectAssiment;

public class pattern54 {

	public static void main(String[] args) 
	{
		int k=9;
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(j-i>0) 
					System.out.print(k+" ");
				else
					System.out.print(" ");
			}	
			System.out.println();
			k--;

		}

	}

}
