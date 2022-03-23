package Recursion;

public class Addition3 {

	public static void main(String[] args) 
	{
		
     int []a= {3,5,7,9};
     int i=0;
     int sum=0;
     addArrayElements(a,i,sum);
	}

	private static void addArrayElements(int[] a, int i, int sum) 
	{
		if(i<a.length)

		{
			sum=sum+a[i];
			addArrayElements(a, i+1, sum);
		}
		else
		{
			System.out.println(sum);
		}
		
	}

}
