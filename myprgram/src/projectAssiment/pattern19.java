package projectAssiment;

public class pattern19 {

	public static void main(String[] args) {
		for(int i=0;i<18;i=i+2)
		{
			for(int j=0;j<9;j++)
			{
				if((j-i>=-8 && i>6) || (j+i>9 && i<8) )//j-i>=0 //
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
