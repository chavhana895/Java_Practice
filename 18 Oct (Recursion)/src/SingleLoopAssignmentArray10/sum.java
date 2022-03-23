package SingleLoopAssignmentArray10;

public class sum {

	public static void main(String[] args) 
	{  
		int []a= {1,2,3,4,5,6,7};
		int i=0;
		int result=addArrayElement(a,i);
		System.out.println(result);
		
	}

	private static int addArrayElement(int[] a, int i) 
	{
		if(i<a.length)
		{
			int sum=addArrayElement(a, i+1);
					return a[i]+sum;
		}
		return 0;
	}

}
