package Recursion;

import java.util.Arrays;

public class incDecArray {
    
	static int inc=1,inn=0,dec=1,den=0,inIndex=1,deIndex=1;
	public static void main(String[] args) 
	{
		int []a= {5,1,3,6,8,2,9,0,10};
	//	int []a= {1,2,4,0,2};
		if(a[0]>a[1])
		{
			den=a[0]; inn=a[1];
		}
		else
		{
			den=a[1]; inn=a[0];
		}
		int i=2;
		findCount(a,i);
		int []ina=new int[inc];
		int []dea=new int[dec];
		if(a[0]>a[1])
		{
			den=a[0]; inn=a[1];
			dea[0]=a[0]; ina[0]=a[1];
		}
		else
		{
			den=a[1]; inn=a[0];
			dea[0]=a[1]; ina[0]=a[0];
		}
		i=2;
		putElements(a,i,ina,dea);
		System.out.println(Arrays.toString(ina));
		System.out.println(Arrays.toString(dea));
	}
	
	private static void putElements(int[] a, int i, int[] ina, int[] dea) 
	{
	  if(i<a.length)
	  {
		  if(a[i]>inn)
		  {
			  inn=a[i];
			  ina[inIndex++]=a[i];
		  }
		  else
		  {
			  den=a[i];
			  dea[deIndex++]=a[i];
		  }
		  putElements(a, i+1, ina, dea);
	  }
	}
	private static void findCount(int[] a, int i)
	{
	  if(i<a.length)
	  {
		  if(a[i]>inn)
		  {
			  inc++;inn=a[i];
		  }
		  else if(a[i]<den)
		  {
			  dec++;den=a[i];
		  }
		  else
		  {
			  System.out.println("No such sequence Possible");
			  System.exit(0);
		  }
		  findCount(a,i+1);
	  }
	}
}
