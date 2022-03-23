package array20_oct;

public class tripalets37 {

	public static void main(String[] args) 
	{
		int a[]= {1,5,-4,-2,-1,9};
		int cnt=0;
		triplate(a,cnt,0,1,2);
	}

	private static void triplate(int[] a, int cnt, int i, int j, int k) 
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				if(k<a.length)
				{
					if(a[i]+a[j]+a[k]==2)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
				
				if(k<a.length)
				{
					k++;					
				}
				else
				{
					//k=k+1;
				j++;
				}
			}
			
			if(j<a.length)
			{
				j++;
			}
			else
			{
				j=i+1;
				i++;
			}	
			triplate(a, cnt, i, j, k);
		}
		
	}

}
