package practice;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int num=5;
		int min=0;
		int max=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{ 
		 if(max<min)
		 {
			 System.out.println("Not Found");
			 break;
		 }
		 int mid=(min+max)/2;
		 if(num==a[mid])
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
