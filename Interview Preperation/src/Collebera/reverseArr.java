package Collebera;

import java.util.Arrays;

public class reverseArr {

	public static void main(String[] args) 
	{
    int []a= {536,14,12,8,47};
   
    int i=0;
    int j=a.length-1;
    
    while(i<j)
    {
    	int temp=a[i];
    	a[i]=a[j];                        //Array reverse logic
    	a[j]=temp;
    	i++;
    	j--;
    }
    
   System.out.println(Arrays.toString(a));
   System.out.println(a);


    
//    for (int i= a.length-1; i>=0; i--)
//    {                                        //Print reverse logic
//		System.out.print(a[i]+" ");
//	} 
	}
}