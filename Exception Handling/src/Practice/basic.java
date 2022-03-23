package Practice;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Enter Two Nums (please don't use 0)");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  
	  try {
		  System.out.println(a/b);
	  }
	  catch (Exception e) 
	  {
		System.out.println("You can't divide by 0");
	  }
			  
	}

}
