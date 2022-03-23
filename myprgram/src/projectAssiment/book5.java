package projectAssiment;

public class book5 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			int n=0,m=70;
			for(int j=0;j<14;j++)
			{
				if(j-i<=0)
					System.out.print((char)(65+j));
				else if(j+i>12)
					System.out.print((char)(m--));
				else
					System.out.print(" ");
				n++;
			}
			System.out.println();
		}
	}

}
