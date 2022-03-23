package Recursion;

public class sumOfArrayElement {

	public static void main(String[] args) 
	{
		int []a= {3,5,7,9};
		int i=0;
		int sum=0;
		int finalAddition=addArrayElements(a,i,sum);

		System.out.println(finalAddition);
	}

	private static int addArrayElements(int[] a, int i, int sum) 
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			return addArrayElements(a, i+1, sum);
		}
		else
		{
			return sum;
		}
	}

}
