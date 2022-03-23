package Prelims1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		
		String []a=new String[10];
		 int index=0;
		for (int i = 0; i < 10; i++)
		{
			a[index++]=sc.nextLine();
		}
		System.out.println(Arrays.toString(a));
	}

}
