package Collebera;

import java.util.Scanner;

public class twentyElementODD {

	public static void main(String[] args) 
	{
	  final int numCnt=20;
	  Scanner sc=new Scanner(System.in);
	  
	  int a[]=new int[numCnt];
	  int even[]=new int[numCnt];
	  int odd[]=new int[numCnt];
	  
	  System.out.println("Enter 20 Numbers: ");
	  for (int i = 0; i < numCnt; i++)
	  {
		a[i]=sc.nextInt();
	  }
	  
	  int evenIndex=0;
	  int oddIndex=0;
	  
	  for (int i = 0; i < odd.length; i++)
	  {
		if(a[i]%2==0)
			even[evenIndex++]=a[i];
		else
			odd[oddIndex++]=a[i];
	  }
	  
	  System.out.println("Even Numbers: ");
	  for (int i = 0; i < evenIndex; i++) 
	  {
		System.out.print(even[i]+" ");
	  }
	  System.out.println();
	  
	  System.out.println("Odd Numbers: ");
	  for (int i = 0; i < oddIndex; i++)
	  {
		System.out.print(odd[i]+" ");
	  }
	  
	}

}
