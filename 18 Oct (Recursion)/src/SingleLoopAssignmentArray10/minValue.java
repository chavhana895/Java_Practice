package SingleLoopAssignmentArray10;

public class minValue {

	public static void main(String[] args) 
	{
		int []a= {89,7,5,8,4,2,65,6};
		int i=0;
		int min=Integer.MAX_VALUE;
	minElementofArray(a,i,min);
	}

	private static void minElementofArray(int[] a, int i, int min) 
	{
	   if(i<a.length)
	   {
		   if(a[i]<min)
			 min=a[i];
			 minElementofArray(a, i+1, min);
	   }
		   else
			   System.out.println(min);
	   }
	
	}

