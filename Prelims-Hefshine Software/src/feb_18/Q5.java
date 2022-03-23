package feb_18;

public class Q5 {

	public static void main(String[] args) 
	{
		int [] a = {9,2,3,5,64,1,8,7,2,15};
		
		for (int i = 0; i < a.length-1; i++)                   //Array HW-7
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
