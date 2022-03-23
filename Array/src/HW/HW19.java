package HW;

import java.util.Scanner;

public class HW19 
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter row for the array: ");
	  int row = sc.nextInt();
	  System.out.println("Enter column for the array: ");
	  int column=sc.nextInt();
	  int [][] a = new int[row][column];
	  
	  for (int i = 0; i < row; i++)
	  {
		for (int j = 0; j < column; j++) 
		{
		System.out.print(a[i][j]+" ");
		}
	  }
	}

}
