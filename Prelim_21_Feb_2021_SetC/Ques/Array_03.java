package Ques;

import java.util.Arrays;

public class Array_03 {

	public static void main(String[] args) {

//		3 Split array arr[] into strictly increasing and decreasing sequences in
//		single loop and without changing the original order.
//		(Variations)
//		Example 1 Input: aryl]_ [5, 1, 3, 6, 8, 2, 9, 0, 10] 
//		Output: [1, 3, 6, 8, 9, 10] [5, 2, 0]
//		Example 2 Input: arr[j = [1, 2, 4, 0, 2] Output: -1

		int[] a = {5, 1, 3, 6, 8, 2, 9, 0, 10};
		
		int[] inca=new int[6];
		int[] deca=new int[3];

		int incele=0;
		int decele=0;
		if(a[0]>a[1])
		{
			inca[0]=a[1];
			deca[0]=a[0];
			decele=a[0];
			incele=a[1];
		}
		else
		{
			inca[0]=a[0];
			deca[0]=a[1];
			decele=a[1];
			incele=a[0];
		}
//		System.out.println(incele+" "+decele);
		int incindex=1;
		int decindex=1;
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>incele)
			{
				inca[incindex++]=a[i];
				incele=a[i];
			}
			else if(a[i]<decele)
			{
				deca[decindex++]=a[i];
				decele=a[i];
			}
			else
			{
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		System.out.println(Arrays.toString(inca));
		System.out.println(Arrays.toString(deca));
		
	}

}
