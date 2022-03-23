package practice;

public class AngularMind4 {
public static void main(String[] args) 
{
	for (int i = 0; i < 5; i++) 
	{
		for (int  j = 0; j < 5; j++) 
		{
			if(i+j<=4)
			System.out.print("0");
			else if(j+i>=5)
			{   if(j+i==5)
				System.out.print("1");
			else if(j+i==6)
				System.out.print("2");
			else if(j+i==7)
				System.out.print("3");
			else
				System.out.print("4");
		    }
			}
		System.out.println();
	}
}
}
