package projectAssiment;

public class book4 {

	public static void main(String[] args) {
		
		for(int i=0;i<9;i++)
		{
			int cnt=5;
			for(int j=0;j<5;j++)
			{
				if(j-i<=-4 )// second
				{
					System.out.print(9-i+j);
				}
				else if( j+i<=4)//
					System.out.print(j+i+1);
				else
					System.out.print("-");
			}
			
			System.out.println();
		}
	}

}
