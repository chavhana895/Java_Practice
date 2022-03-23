package Pre_Basics;

import java.util.Scanner;

public class KaprekarNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int num=sc.nextInt();
		int num1=num;
		int noOfDigit=0;
		while(num1>0)
		{
			noOfDigit++;
			num1=num1/10;
		}
		
		int sq=num*num;
		int d=(int)Math.pow(10, noOfDigit);
		if(sq/100+sq%100==num)
			System.out.println("Kaprekar");
		else
			System.out.println("Not");
	}

}
