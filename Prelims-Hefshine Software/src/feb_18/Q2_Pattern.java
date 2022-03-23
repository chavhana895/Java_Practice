package feb_18;

public class Q2_Pattern {

	public static void main(String[] args) 
	{

		
		for(int i=0;i<5;i++)
		{                                                         //star 73
			int count=1;
			for(int j=0;j<9;j++)
			{
				if(j<=i*2)
					System.out.print((char)(count+64));
				else
					System.out.print(" ");
				if(j-i<0)
					count++;
				else
					count--;
			}
			System.out.println();   
		}
	}
	}


