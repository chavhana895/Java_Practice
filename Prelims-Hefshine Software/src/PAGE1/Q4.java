package PAGE1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Give 1st Value");
	  int a=sc.nextInt();
	  System.out.println("Give 2nd Value");
	  int b=sc.nextInt();
	  int num=11;
	  int count=0;
	  int []c= {-2,4,1,5,3,11};
	  
	  for (int i = 0; i < c.length; i++) 
	  {
		if(c[i]+a+b==num)
		{
			System.out.println(c[i]+" "+a+" "+b);
			count++;
		}
	  }
	  
	  System.out.println("pairs: "+count);

	}
}
