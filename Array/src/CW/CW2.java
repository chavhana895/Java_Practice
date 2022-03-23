package CW;

public class CW2 
{
	public static void main(String[] args)
	{
		int [] a = {2,5,8,13,26,46,59,63};
		int num=13;
		int min=0,max=a.length-1;
		while(true)
		{                   // Binary Search
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
