package array;

import java.util.Iterator;

public class Q7 {

	public static void main(String[] args) {
		
		String s="dhvafsfdb";
		int max=Integer.MIN_VALUE;
		int startIndex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			String s1="";
			for (int j = 0; j < s.length(); j++) 
			{ int count =0;
			 
			for (int k = 0; k < s1.length(); k++) 
			{
				if(s1.charAt(k)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				s1=s1+s.charAt(j);
			}
			else
			{
				if(max<s1.length());
				{
					max=s1.length();
					startIndex=i;
				}
				break;
			}
			if(j==s.length()-1)
			{
				if(max<s1.length())
				{
					max=s1.length();
					startIndex=i;
				}
			}
			}
			
		}
		System.out.println(max);
		for (int i = 0; i < args.length; i++) 
		{
		   System.out.println(s.charAt(s.charAt(i)));	
		}
			
		}
	}
