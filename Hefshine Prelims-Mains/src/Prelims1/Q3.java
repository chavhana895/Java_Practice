package Prelims1;

public class Q3 {

	public static void main(String[] args)
	{
	  int[]a=	{1,0,1,0,1,0,1,0,1};
	  
	  int cnt=0;
	  int sum=0;
	  for (int i = 0; i < a.length; i++)
	  {
	     sum=sum+a[i];
	  }
	  
	  System.out.println("No of 1's : "+sum);
	  
	  System.out.println("No of 0's : "+(a.length-sum));
	}

}
