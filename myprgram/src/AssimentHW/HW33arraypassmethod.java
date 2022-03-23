package AssimentHW;

import java.util.Arrays;

public class HW33arraypassmethod {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		print(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		//print(new int[] {11,22,33,44,55,66}); // anayanomas Aarry 
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
		{
			//System.out.print(a[i]+" ");
			a[i]=0;
		}
		
	}

}
