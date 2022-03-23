package ArrayProb;

public class BinarySearchmidMaxFound {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		
		int num=40;
		int min=0; int max=a.length-1;
		
		while(true)
		{
			if(max<min)
			{
				System.out.println("Not Found");
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
		

	}

}
