package mostIMP;

import java.util.Scanner;

public class binarySort {

	public static void main(String[] sarang) 
	{
      int []a= {1,2,3,4,5,6,7,8};
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number: ");
      int num = sc.nextInt();
      int min=0, max=a.length-1;
      
      while(true)
      {
    	  if(min>max)
    	  {
    		  System.out.println("Not Found");
    		  break;
    	  }
    	 int mid= (min+max)/2;
    	 if(a[mid]==num)
    	 {
    		 System.out.println("Found at: "+mid);
    		 break;
    	 }
    	 else if(num>a[mid])
    		min= mid+1;
    	 else
    		 max=mid-1;
    		 
      }
	}

}
