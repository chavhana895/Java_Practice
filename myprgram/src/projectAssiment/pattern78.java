package projectAssiment;

public class pattern78 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<21;j++)
			{
				if(j-i<=0) 
					System.out.print("*");
				else if(j+i<=9 && j>=5) 
					System.out.print("*");
				else if(j-i>=11&& j<=15) 
					System.out.print("*");
				else if(j+i>=20) 
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}

}
