package SingleLoopAssignmentArray10;

public class max {

	public static void main(String[] args) 
	{
		int []a= {2,3,4,5,6,7,8,78,12};
		int i=0;
		int max=Integer.MIN_VALUE;
		maxValueInArray(a,i,max);
	}

	private static void maxValueInArray(int[] a, int i, int max) 
	{
		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			maxValueInArray(a, i+1, max);
		}
		else
		{
			System.out.println(max);
		}
	}

}
