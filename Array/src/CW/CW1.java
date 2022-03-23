package CW;

public class CW1
{

	public static void main(String[] args)
	{
		int [] a = {1,2,3,5,12};
		   int sum=0;
		   int cnt=0;
		   for (int i = 0; i < a.length; i++)
		   {
			  sum=sum+a[i];
			  cnt++;
		   }
		   System.out.println("Sum : "+sum);
		  
		   System.out.println();
		   
		   System.out.println("Average is : "+sum/cnt);
	}

}
