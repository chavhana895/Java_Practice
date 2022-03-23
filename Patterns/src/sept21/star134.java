package sept21;

public class star134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<8;i++)
{
	for(int j=0;j<5;j++)
	{
				if( j==0 &&i==7 ||j==4 && i==7)
		            System.out.print(" ");
				else if(j==0 || j==4 || i==7 )
					System.out.print("*");

		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
