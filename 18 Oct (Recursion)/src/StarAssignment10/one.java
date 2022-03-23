package StarAssignment10;

public class one {

	public static void main(String[] args) {
		int i=0,j=0;
		
		starPattern(i,j);

	}

	private static void starPattern(int i, int j) 
	{
		if(i<5)
		{
			if(j+i<5)
				System.out.print("*");
			else
				System.out.print(" ");
			if(j<5)
				j++;
			else 
			{
				j=0;i++;
				System.out.println();
			}
			starPattern(i, j);
		}
		
	}

}
