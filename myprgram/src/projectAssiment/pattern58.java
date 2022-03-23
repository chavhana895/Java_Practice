package projectAssiment;

public class pattern58 {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			int k=1;
			for(int j=0;j<5;j++)
			{
				if(( j+i<5 && i<5))
				{
					System.out.print(k++);
				}
				else if((j-i<-3)) //j+i<5
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
			k++;
		}
	}

}
