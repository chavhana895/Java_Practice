package miniPreExam;

public class Q8 {

	public static void main(String[] args) 
	{
	  for (int i = 0; i < 10; i++) 
	  {
		for (int j = 0; j < 10; j++) 
		{
			if(( j<5 && j-i>=0 ) || (j-i<=0 && j>3))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	  }
	}

}