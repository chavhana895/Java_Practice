package projectAssiment;

public class pattern72 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) 
		{
			int cnt=1;
			for (int j = 0; j < 9; j++) 
			{
				if(j-i>4 || i+j<4)//
					System.out.print(" ");
				else
				{
					if(j<4)
						System.out.print(cnt++);
					else
						System.out.print(cnt--);					}
				}
			System.out.println();
		}
	}

}
