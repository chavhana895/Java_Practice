package CW;

public class CW_2_binarySearch {

	public static void main(String[] args) {
		int []a= {5,10,15,16,20,25};
		int num=16;
		int min=0, max=a.length-1;
		while(true)
		{
			if(min>max)
			{
				System.out.println("Not found");
				break;
			}
			int mid=(min+max)/2;
		    if(a[mid]==num)
		    {
				System.out.println("found at: "+mid);
				break;
		    }	
			 else if(num>a[mid])
				 min=mid+1;
			 else
				 max=mid-1;
				 }
		
		
		
		
		
		
		
		/*int []a1= {1,2,3,4,5};
		int min1=0,max1=a1.length-1;
		int num1=2;
		while(true)
		{
			if(min1>max1)
			{
				System.out.println("Not found");
				break;
			}
			int mid=(min1+max1)/2;
			if(num1==a1[mid])
			{
				System.out.println("found at: "+mid);
				break;
			}
			else if(num1>a1[mid])
				min1=mid+1;
			else
				max1=mid-1;	
		}*/
		
	}

}
