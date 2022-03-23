package Array;

public class SingleLoopSorting {

	public static void main(String[] args) {
		int []a= {23,56,12,78,36,93};
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(i<j && a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(j==a.length-1)
			{
				j=0;i++;
			}
			else
				j++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
