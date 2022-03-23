package searchingTechnique;

import java.util.Scanner;

public class binary {

	public static void main(String[] args)
	{
	  int []a= {11,12,13,14,15,16};
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number: ");
	  int num=sc.nextInt();
	  
	  int min=0, max=a.length-1;
	  while(true)
	  {
		  if(min>max)
		  {
			  System.out.println("Not Found");
			  break;
		  }
		  int mid=(min+max)/2;
		  if(a[mid]==num)
		  {
			  System.out.println("Found at: "+mid);
			  break;
		  }
		  else if(num>a[mid])
			  min=mid+1;
		  else
			  max=mid-1;
	  }
	}

}
