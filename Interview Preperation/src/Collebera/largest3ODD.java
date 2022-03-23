package Collebera;

import java.util.Arrays;

public class largest3ODD 
{
public static void main(String[] args)
{
	int []a= {24,13,25,23,93,84,67,74,27,83};
	int cnt=0;
	for (int i = 0; i < a.length; i++)
	{
		if(a[i]%2!=0)
		{
			cnt++;
		}
	}
	
	int b[]=new int[cnt];
	
	int Oddindex=0;
	
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2!=0)
		{
			b[Oddindex++]=a[i];
		}
	} 
	
	for (int i = 0; i < b.length; i++)
	{
		for (int j = i+1; j < b.length; j++) 
		{
			if(b[i]<b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(b));
	
	System.out.println("Largest 3rd Element: "+b[2]);
	
}
}
