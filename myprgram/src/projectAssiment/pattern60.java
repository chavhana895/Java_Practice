package projectAssiment;

public class pattern60 {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j+i>=8)|| (j-i>=0))
					System.out.print(1+j+" ");
				else
					System.out.print("-");
			}	
			System.out.println();
		}
	}

}
