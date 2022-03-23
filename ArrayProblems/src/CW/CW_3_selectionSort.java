package CW;

public class CW_3_selectionSort {

	public static void main(String[] args) {
	/*	int []a= {12,35,31,25,87,5,75};
for (int i = 0; i < a.length; i++) 
{   int min=i;
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
}*/
		
		int []a= {15,13,43,14,27,43,34};
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])  
				min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
