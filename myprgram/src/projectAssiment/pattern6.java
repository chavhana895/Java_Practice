package projectAssiment;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub j+i>=4
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4)//
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();

		}

	}

}
