package projectAssiment;

public class pattern52 {

	public static void main(String[] args) {
		for(int i=1;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j+i>8 ) 
					System.out.print(i+"");
				else
					System.out.print(" ");
			}	
			System.out.println();

		}

	}

}
