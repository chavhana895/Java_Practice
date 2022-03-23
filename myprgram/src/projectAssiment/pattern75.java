package projectAssiment;

public class pattern75 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++)
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
		}
	}

}
