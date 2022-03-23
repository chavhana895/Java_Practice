package projectAssiment;

public class patern79 {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j-i<=0 && j+i<9)//
					System.out.print((char)(1+j+64));
				else if(j+i>8&& j-i>=1)//
					System.out.print((char)(74-j));
				
				else
					System.out.print("-");
			}
			System.out.println();

		}

	}

}
