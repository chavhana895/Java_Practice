package Recursion;

import java.util.Arrays;

public class EvenArray {

	public static void main(String[] args) 
	{
		int []a= {3,7,9,2,8,5,6};
		int evenCount=0;
		int i=0;
		evenCount=checkEven(a,i,evenCount);
		int []evenArray=new int[evenCount];
		int[]oddArray=new int[a.length-evenCount];
		i=0; int evenIndex=0; int oddIndex=0;
		oddElementInArray(a,i,evenArray,evenIndex,oddArray,oddIndex);
		System.out.println("Even Array");
		System.out.println(Arrays.toString(evenArray));
		System.out.println("odd Array");
		System.out.println(Arrays.toString(oddArray));
	}

	private static void oddElementInArray(int[] a, int i, int[] evenArray, int evenIndex,
			int[] oddArray,
			int oddIndex) 
	{
		if(i<a.length)
		{
		  if(a[i]%2==0)
		  {
			  evenArray[evenIndex++]=a[i];
		  }
		  else
		  {
			 oddArray[oddIndex++]=a[i];
		  }
		  oddElementInArray(a, i+1, evenArray, evenIndex, oddArray, oddIndex);
		}
	}
	private static int checkEven(int[] a, int i, int evenCount) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				evenCount++;
			int count=checkEven(a, i+1, evenCount);
			return count;
		}
		else
		return evenCount;
	}
}
