package CW;

public class CW2 {

	public static void main(String[] args) {
	int []a= {5,10,15,20,25,30};	
	int num=25;
	int min=0;int max=a.length-1;
	
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
