package SortingTechnique;

public class InsertionSort {

	public static void main(String[] args) 
	{
	   int []a = {11,78,34,72,15,36};
	   
	   for (int i = 1; i < a.length; i++) 
	   {
		   int temp=a[i];
		   int start=0;
		 for (int j = i-1; j >=0; j--) 
		 {
		   if(a[j]<temp)
		   {
			   start=j+1;
			   break;
		   }
		 }
		 
		 for (int j = i-1; j >= start; j--) 
		 {
		   	a[j+1]=a[j];
		 }
		 a[start]=temp;
	   }
	   
	   for (int i = 0; i < a.length; i++) 
	   {
		System.out.print(a[i]+" ");
	   }
	}
}