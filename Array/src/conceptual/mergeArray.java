package conceptual;

import java.util.Arrays;

public class mergeArray {

	public static void main(String[] args)
	{
	int []a= {1,2,3,4};
	int [] b= {7,8,9};
	int index=0;
	int []c=new int[a.length+b.length];
	
	for (int i = 0; i < a.length; i++)
	{
		if(i<a.length)
			c[index++]=a[i];
		
	}
	for (int i = 0; i < b.length; i++)
	{
		if(i<b.length)
			c[index++]=b[i];
	}
	System.out.println(Arrays.toString(c));
	
//	for (int i = 0; i < c.length; i++)
//	{
//		if(i<a.length)
//			c[index++]=a[i];
//		if(i<b.length)
//			c[index++]=b[i];
//		
//		
//	}
//	System.out.println(Arrays.toString(c));
	}

}
