package array;

public class binarySearch {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int num=2;
		int min=0;
		int max=a.length;
		
		while(true)
		{
			if(max<min)
			{
				System.out.println("Not Found");
				break;
			}
			int mid=(min+max)/2;
			if(num==a[mid])
			{
				System.out.println("Found: "+mid);
				break;
			}
			else if(num>a[mid])
				min=mid+1;
			else
				max=mid-1;
		}
	}

}
