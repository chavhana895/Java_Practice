package Q5;

import java.util.Scanner;

public class UserRegistrastion {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Your Age: ");
	 int a =sc.nextInt();
	 
	 if(a<18)
		 throw new ArithmeticException("User is Minor");
	 else
		 System.out.println("User is eligible");
	}

}
