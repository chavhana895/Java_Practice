package recursionday2_19_oct;
public class matrimultiplication {
	public static void main(String[] args) 
	{
		int [][]a= {{1,2,3},
				{3,2,1}};	
		int [][]b= {{1,2},
				{3,2},
				{1,1}};
		int c[][]=new int[a.length][a.length];
		muntilpay(a,0,b,0,c,0);
		printMarix(c,0,0);
	}
	private static void printMarix(int[][] c, int i, int j)
	{
		if(i<c.length)
		{
			if(j<c.length)
			{
				System.out.print(c[i][j]+" ");
			}
			j++;
			if(j==c.length)
			{
				j=0;
				i=i+1;
				System.out.println();
			}
			printMarix(c, i, j);
		}		
	}
	private static void muntilpay(int[][] a, int i, int[][] b, int j, int[][] c, int k)
	{
		if(i<a.length)
		{
			if(j<b.length)
			{
				if(k<3)
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				k++;
				if(k==b.length)
				{
					k=0;
					j=j+1;
				}
			}
			if(j==a.length)
			{
				j=0;
				i=i+1;
			}
			muntilpay(a, i, b, j, c, k);
			
		}
		
	}

}
