package projectAssiment;

public class pattern55 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			int k=1;

			for(int j=0;j<=5;j++)
			{
				if((j-i<0 && i<=5 )||(i+j<10 && i>5))//  
					System.out.print(k++);
				else
					System.out.print("-");
			}	
			System.out.println();

		}


	}

}
