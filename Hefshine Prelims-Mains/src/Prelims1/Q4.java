package Prelims1;
import java.util.*;
public class Q4 {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter num 1: ");
	   int num1=sc.nextInt();
	   System.out.println("Enter num 2: ");
	   int num2=sc.nextInt();
	   
	   for (int i = 0; i < num1; i++)
	   {
		for (int j = i+1; j < num1; j++)
		{
			for (int j2 = j+1; j2 < num1; j2++)
			{
				if((i+j+j2==num1) & (i!=num2 & j!=num2 & j2!=num2))
					System.out.println(i+" "+j+" "+j2);
			}
		}
	   }
	   
	}

}
