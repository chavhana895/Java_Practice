package Prelims1;

public class Q2 {

	public static void main(String[] args)
	{
		int [] []a = { {1,2,3,4,5},
		         {5,3,3,6,7},
		         {3,4,2,3,6},
		         {4,2,7,8,9},
		         {4,6,3,6,9}};
 
 int counter=0;
 int sum=0;
 for (int i = 1; i < a.length-1; i++) 
 {
	for (int j = 1; j < a.length-1; j++) 
	{
		System.out.print(a[i][j]+" ");
			sum=sum+a[i][j];
		    counter++;
	}
	System.out.println();
 }
 System.out.println("______Average_____");
 System.out.println("Avg "+sum/counter);
	}

}
