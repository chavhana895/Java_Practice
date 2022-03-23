
public class evenOdd {

	public static void main(String[] args) {
		int[]a= {1,2,3,15,4,5,7,17,8,9};
		for (int i = 0; i < a.length; i++) 
		{
		for (int j =i+1; j < a.length; j++) 
		{
			if(a[i]%2!=0 && a[j]%2==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
