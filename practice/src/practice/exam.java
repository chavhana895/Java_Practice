package practice;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 13; i++) 
		{
			for (int j = 0; j <18 ; j++) 
			{
				if(i+j>=3 && j-i<=5 && j<9 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
