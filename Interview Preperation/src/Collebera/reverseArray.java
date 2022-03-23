package Collebera;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) 
	{
	  int a[]= {1,2,64,23,78,12};
	  
	  int i=0;
	  int j=a.length-1;
	  while(i<j)
	  {
		  int temp=a[i];
		  a[i]=a[j];
		  a[j]=temp;
		  i++;
		  j--;
	  }
	  System.out.println(Arrays.toString(a));
	}

}
