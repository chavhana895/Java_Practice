package ArrayProb_Collection;

import java.util.ArrayList;
import java.util.Scanner;



public class printArrayMatrix {

	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row Count");
		int row=sc.nextInt();
		System.out.println("Enter Col Count");
		int col=sc.nextInt();
		
		System.out.println("enter matrix element: ");
		for (int i = 0; i <row; i++)
		{
			list.add(new ArrayList<Integer>());
			
		}
		
		for (int i = 0; i < row; i++) 
		{
			ArrayList<Integer> temp=list.get(i);
			for (int j = 0; j < col; j++) 
			{
				int num=sc.nextInt();
				temp.add(num);
			}
		}

		for (int i = 0; i < list.size(); i++) 
		{
			for (int j = 0; j < list.get(i).size(); j++) 
			{
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
