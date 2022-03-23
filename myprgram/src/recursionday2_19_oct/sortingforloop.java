package recursionday2_19_oct;

public class sortingforloop {

	public static void main(String[] args)
	{
		int i=0;
		int a[]= {7,3,8,2,9,1};
		sortI(a,i);
		i=0;
		printArray(a,i);

	}

	private static void printArray(int[] a, int i) {
		if(i<a.length)
		{
			System.out.print(a[i]+"  ");
			printArray(a, i+1);
		}
	}

	private static void sortI(int[] a, int i) 
	{
		if(i<a.length)
		{
			int j=i+1;
			sortJ(i,j,a);
			sortI(a, i+1);
		}
		
	}

	private static void sortJ(int i, int j, int[] a)
	{
		if(j <a.length)
		{
			if(a[i]>a[j])
			{			
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			sortJ(i, j+1, a);
		}
		
	}

}
