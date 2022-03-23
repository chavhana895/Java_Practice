package HW;

import java.util.Scanner;

public class HW28
{

	public static void main(String[] args) 
	{
		int [][]a=new int[2][3];
		int [][]b=new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values for Matrix A: ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
			  a[i][j]=sc.nextInt();
					  
			}	
		}
		System.out.println("Enter Values For Matrix B: ");
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
			  b[i][j]=sc.nextInt();
					  
			}	
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				int element=a[i][j];
				int row=i;
				int col=j;
				int SmallerElementsInRow=0;
				for (int i2 = 0; i2 < a.length; i2++) 
				{
					for (int j2 = 0; j2 < a.length; j2++) 
					{
						if(i2==row)
						{
							if(a[i2][j2]<element)
								SmallerElementsInRow++;
						}
					}
				}
				int greaterElementInCol=0;
				for (int i2 = 0; i2 < a.length; i2++) 
				{
					for (int j2 = 0; j2 < a.length; j2++) 
					{
						if(j2==col)
						{
							
							if(a[i][j]>element)
							greaterElementInCol++;
						}
					}
				}
				if(SmallerElementsInRow==0 && greaterElementInCol==0)
					System.out.println(a[i][j]);
			}
		}
		
	}

}
