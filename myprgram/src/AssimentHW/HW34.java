package AssimentHW;

import java.util.Scanner;

public class HW34 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Number ");
		int a[]=new int[10];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<0)
				System.out.println("nagative number :- "+a[i]);
			else if(a[i]>0)
				System.out.println("Positive number :- "+a[i]);
			 if(a[i]%2==0)
				System.out.println("even number \t:-"+a[i]);
			else if(a[i]%2!=0)
				System.out.println("Odd number :-"+a[i]);
		}
	}

}
