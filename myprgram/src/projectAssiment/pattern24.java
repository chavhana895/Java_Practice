package projectAssiment;

public class pattern24 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j+i>=4 && j+i<=8 && j<9) 
					System.out.print("*");
				else if(j-i>=-6 && i>5) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
