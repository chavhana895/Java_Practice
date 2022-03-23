
public class max {

	public static void main(String[] args) {
		int []a= {2,53,7,63,8,1,4,24};
		int i=0;
		int max=Integer.MIN_VALUE;
		
		maxValue(a,i,max);
	}

	private static void maxValue(int[] a, int i, int max) 
	{
		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
				maxValue(a, i+1, max);		
		}
		else
			System.out.println(max);
		
	}

}
