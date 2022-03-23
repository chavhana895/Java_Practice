package array20_oct;

public class mindiffrence {

	 static int min=Integer.MAX_VALUE;
	public static void main(String[] args) 
	{
		int m=5;
		int n=8;
		int a[]= {1,4,3,1,5,8,8,0,5,3};
		differnce(m,n,a,0,0);
		System.out.println(min);

	}
	private static void differnce(int m, int n, int[] a,int i,int j) 
	{
		if(i<a.length)
		{
			if(a[i]==m)
			{
				if(j<a.length)
				{
					if(a[j]==n)
					{
						if(i>j)
						{
							if(i-j<min)
							{
								min=i-j;
							}
						}
						else
						{
							if(j-i<min)
							{
								min=j-i;
							}
						}
						
					}
				}
				if(j<a.length)
				{
					j++;
				}
				else
				{
					i++;
					j=0;
				}
				differnce(m, n, a, i, j);
			}
		}
	}

}
