package Practice;

import java.util.Scanner;

public class one {

	public static void main(String[] args) 
	{
	//	int num = addition();
		//System.out.println(num);
		
	//	addition1();  
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Nums");
		int pqr=addFour(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		addition3(7,8);
		

	}

	private static void addition3(int i, int j) 
	{  
		int sum=i+j;
				System.out.println(sum);            //parametrize with no return type
		
	}

	private static int addFour(int nextInt, int nextInt2, int nextInt3, int nextInt4) 
	{
		int sum=nextInt+nextInt2+nextInt3+nextInt4;                                //parameterize with return type
		return sum;
	}

	private static void addition1() 
	{
		int a=6;                           //non parameterize with no return type
		int b=2;
		int c=a+b;
		System.out.println(c); 
		}

	private static int addition() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a=sc.nextInt();                           //non parameterize with return type
		int b=sc.nextInt();
		int c=a+b;
		
		return c;
		
	}

}
