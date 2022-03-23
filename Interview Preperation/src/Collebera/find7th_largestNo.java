package Collebera;

import java.util.Arrays;

public class find7th_largestNo {

	public static void main(String[] args)
	{
	  int []a= {6,3,1,2,4,9,7,8,0,5,10};
	  for(int i=0; i<a.length;i++)
	  {
		  for(int j=i+1; j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				  int temp=a[i];   //6
				  a[i]=a[j];       //
				  a[j]=temp;       //
			  }
		  }
	  }
	  System.out.println(Arrays.toString(a));
	  int print=a[a.length-7];
	  System.out.println("7th Largest No: "+print);
	  
//	  for (int i = 0; i < a.length; i++) 
//	  {
//		 if(i==6)
//		 {
//			 System.out.println(a[i]);
//			 break;
//		 }
//	  }
	}

}
