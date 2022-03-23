package Sept22;

public class star75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)                        //75
		{
			for(int j=0;j<9;j++)
			{
				if(j-i==0)
					System.out.print(" ");
				else if(j<=2*i)
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
		}
		 
	}

}
