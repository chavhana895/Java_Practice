package Collebera;

import java.util.Scanner;

public class perfectNo {

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter No: ");
	  
	  int num=sc.nextInt();
	  int sum=0;
	  for (int i = 1; i <= num/2; i++)
	  {
		    if(num%i==0)
			sum=sum+i;
	  }
	  if(sum==num)
		  System.out.println("Perfect No");
	  else
		  System.out.println("Not perfect No");
	}

}
