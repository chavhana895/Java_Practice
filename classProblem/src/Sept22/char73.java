package Sept22;

public class char73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++)
{
	for(int j=0;j<9;j++)
	{
		if(j-i==0)
			System.out.print((char)(i+65));
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
