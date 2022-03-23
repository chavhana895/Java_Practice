package Collebera;

import java.util.Arrays;

public class stringREV{
	public static void main(String[] args) {
		String s="good morning";
		
		System.out.println(s);
		String []a=s.split(" ");
		
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		String s1="";
		for (int k = 0; k < a.length; k++)
		{
			s1=s1+a[k]+" ";
		}
		System.out.println(s1);
	
	}
}