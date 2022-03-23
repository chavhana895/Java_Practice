package array20_oct;

public class harshadaRemoveElement {

	static int count=0;
	static int cnt=0;
	
	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4}; // {1,1,1,3}
		harshada(a,n,0,0);
		

	}

	private static void harshada(int[] a, int[] n, int i, int j) 
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				if(a[i]==n[j])
					count++;
			}
			if(count==2)
			{
				j=0;
				i++;
			}
			if(j<a.length-1)
			{
				j++;
			}
			else
			{
				i++;
				count=0;
				j=0;
			}
			harshada(a, n, i, j);
		
		}
	}
}
