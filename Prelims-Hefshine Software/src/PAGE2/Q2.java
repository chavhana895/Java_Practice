package PAGE2;

public class Q2 {

	public static void main(String[] args) 
	{
		
	  for (int i = 0; i <8 ; i++) 
	  {  int count=1;
		for (int j = 0; j < 7; j++) 
		{  
			if(j+i<7)
				System.out.print((char)(j+65));
		}
		for(int j=0;j<7;j++)
		{   if(j+i<7)
			System.out.print((char)(71-(j+i)));
			else
				System.out.print(" ");
		}
		System.out.println();
	  }

	}

}
