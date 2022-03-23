package Array;

import java.util.Arrays;

public class MethodArray {

	public static void main(String[] args) {
		int []a= {1,1,1,1,1,2,2,3,4};
		System.out.println(Arrays.toString(a));
		print(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void print(int[]b)
	{
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=0;
		}
	}

}
