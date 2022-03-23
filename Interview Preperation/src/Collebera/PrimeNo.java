package Collebera;
import java.util.*;
public class PrimeNo {

	public static void main(String[] args)
	{
		
		System.out.println("Prime Numbers: ");
		for (int i = 2; i <=100; i++)
		{
			int cnt=0;
			for (int j = 1; j <=i ; j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i);
			}
		}
		
		
//		int num=0;
//		String primeNo="";
//		for (int i = 1; i <= 100; i++)
//		{
//			int cnt=0;
//			for (num=i; num>=1; num--)
//			{
//			  if(i%num==0)
//				cnt++;
//			}
//			if(cnt==2)
//			{
//			  primeNo=primeNo+i+" ";
//			}
//		}
//		System.out.println("Prime Numbers from 1 to 100");
//		System.out.println(primeNo);
		
		
		

		
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter num: ");
//	  int num=sc.nextInt();
//	  int mid=num/2;
//	  int cnt=0;
//	  if(num==0 | num==1)
//		  System.out.println("Not Prime No");
//	  else
//	  {
//		  for (int i = 2; i <=mid; i++)
//		  {
//			if(num%i==0)
//			{
//				cnt++;
//			}
//		  }
//		  if(cnt==0)
//			  System.out.println("Prime No");
//		  else
//			  System.out.println("Not prime");
//	  }
	}

}
