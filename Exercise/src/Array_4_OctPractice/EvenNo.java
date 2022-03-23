package Array_4_OctPractice;

public class EvenNo {

	public static void main(String[] args) {
		int[]a= {64,4,3,75,87,5,4,32,86};
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
