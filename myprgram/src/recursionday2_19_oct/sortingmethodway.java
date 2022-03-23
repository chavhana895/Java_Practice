package recursionday2_19_oct;

public class sortingmethodway {

	public static void main(String[] args)
	{
		int a[]= {1,6,8,5,2,9};
		int i=0,j=i+1;
		sorting(a,i,j);
		i=0;
		printArrayMethod(a,i);
		

	}

	private static void printArrayMethod(int[] a, int i) {
	if(i<a.length)
	{
		System.out.print(a[i] +"  ");
		printArrayMethod(a, ++i);
	}
		
	}

	private static void sorting(int[] a, int i,int j) 
	{
		if(i<a.length && j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(j  <a.length)
				j++;
			else
			{
				i++;
				j=i+1;
			}
			sorting(a, i, j);
		}
		
	}

}
