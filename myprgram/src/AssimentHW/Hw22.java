package AssimentHW;

import java.util.Scanner;

public class Hw22 {

	public static void main(String[] args)
	{
		System.out.println("HOW many size row and cloum");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]a=new int[row][col];
		System.out.println("Enetr first Araay Element ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		int b[][]= new int[row][col];
		System.out.println("Enetr Second Araay Element ");
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++)
			{
				b[i][j]=sc.nextInt();
			}
			
		}
		int c[][]=new int[row][col];
		System.out.println("Multiplication Of Two Matrix :-");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				for (int k = 0; k < 3; k ++)
				{
			
					c[i][j]=c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Subtraction Of Two Matrix :-");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]-b[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
//c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];
//	c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1]+a[0][2]*b[2][1];
	
//	c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0]+a[1][2]*b[2][0];
//	c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1]+a[1][2]*b[2][1];
	
