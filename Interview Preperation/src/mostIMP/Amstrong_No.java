package mostIMP;

import java.util.Scanner;

public class Amstrong_No {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		
		int remainder=0;
		int num1=num;
		int sum=0;
	
		do 
		{
			remainder=num1%10; // 1^3+5^3+3^3==num, Amstrong num
			int cube=(int)Math.pow(remainder, 3);
			sum=sum+cube;
			num1=num1/10;
		}
		while(num1>0) ;     //153 is Amstrong Num
		if(num==sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
	}
}