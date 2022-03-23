package PAGE1;

import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Characters: ");
		 String s=sc.next();
		 char minchar=' ';
		 int min=Integer.MAX_VALUE;
		 for (int i = 0; i < s.length(); i++) 
		 {
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ch)
					count++;
			}
			if(min>count)
			{
				min=count;
			minchar=ch;
			}
		 }
		 System.out.println("Lowest Frequncy of char:- "+minchar+" "+min);

	}

}
