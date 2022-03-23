package Sorting;

public class ArraySorting {

	public static void main(String[] args) {
		int[]a= {12,67,47,86,36,83,25};
		
		for (int i = 0; i < a.length; i++) 
		{int min=i;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
