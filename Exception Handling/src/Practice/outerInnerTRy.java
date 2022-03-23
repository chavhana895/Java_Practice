package Practice;

import java.util.Scanner;

public class outerInnerTRy {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Two nums (don't use 0)");
	 int a=sc.nextInt();
	 int b= sc.nextInt();
	 
	 String s="abcd";
	 try {
		 try {
			 System.out.println(a/b);
		     }
		 catch (Exception e) 
		 {
		    System.out.println("Some issue");
		 }
		 try 
		 {
			 System.out.println(s.charAt(100));
		 }
		 catch (Exception e) 
		 {
			System.out.println("Some issue");
		}
	}
	 catch (Exception e) 
	 {
		System.out.println("Both are false");
	 }
	 }

}
