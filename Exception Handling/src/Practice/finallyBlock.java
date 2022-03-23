package Practice;

import java.util.Scanner;

public class finallyBlock {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	 
	  int [] b = {1,2,3,4,5,6};
	  String s="abscdd";
	  
	  try 
	  {
		System.out.println(10/5);
		System.out.println(s.charAt(100));
	  } 
	  catch (ArithmeticException m) 
	  {
		 System.out.println("Arrithmatic exception");
	  }
	  catch (StringIndexOutOfBoundsException n) 
	  {
		System.out.println("msg to string team");
	  }
	  finally 
	  {
		  sc.close();
	   System.out.println("Something else");
	  }
	}

}
