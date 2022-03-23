package StarProblems;

public class star113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<13;i++)
{
	for(int j=0;j<17;j++)
	{if(j+i>=3 && j-i<=5 && j<9 && j-i>=-4 )
		System.out.print("*");
		
	else if(i+j>=11 && j>8 && j+i<=20 && j-i<=13)
			System.out.print("*");
	else
		System.out.print(" ");
	}
	System.out.println();
}
	}

}
