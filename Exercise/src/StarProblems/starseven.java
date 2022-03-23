package StarProblems;

public class starseven {

	public static void main(String[] args) {
		/*for(int i=0;i<9;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j+i>8 || j-i>0)
					System.out.print("");
				else
					System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<9;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j+i>8 || j-i>0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		
		/*for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j<=4 || j-i< )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i<-4 || j+i<4)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
