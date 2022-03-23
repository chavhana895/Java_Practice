package Recursion;

public class reverseArray {

	public static void main(String[] args) {
		
		int []a= {12,32,43,74};
        int i=0,j=a.length-1;
        reverseArrayElement(a,i,j);
	}

	private static void reverseArrayElement(int[] a, int i, int j) 
	{
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			reverseArrayElement(a, ++i, --j);
		}
		else
		{
			int index=0;
			reverseArrayElement(a, index);
		}
		
	}

	private static void reverseArrayElement(int[] a, int index) 
	{
		if(index<a.length)
		{
          System.out.println(a[index]+" ");
          reverseArrayElement(a, ++index);
		}
	}
}
