package SortingTechnique;

public class binarySearch {

	public static void main(String[] args) 
	{
	 int [] a= {10,20,30,40,50};
	 int num=30;
	 
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
