package projectAssiment;

public class pattern113 {

	public static void main(String[] args) {
		for(int i=0;i<12;i++)
		{
			
			for(int j=0;j<16;j++)
			{
				if(j+i>=3 &&j-i>=-4&& j-i<=5 &&j<8) 
					System.out.print("*");
				else if(j+i>=11 && j-i<=13 && j+i<=18  && j>7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
