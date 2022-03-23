package SingleLoopAssignmentArray10;

public class reverseArray {

	public static void main(String[] args) 
	{
		int []a= {1,54,32,84,24};
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
		   printReverseArray(a,index);
	   }
	}

	private static void printReverseArray(int[] a, int index) 
	{
	   if(index<a.length)
	   {
		   System.out.println(a[index]);
	   }
	}	
}
