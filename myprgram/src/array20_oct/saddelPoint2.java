package array20_oct;

public class saddelPoint2 {

	public static void main(String[] args)
	{
		int a[][]= {{6,3,1},
				{9,7,8},
				{2,4,5}};
	checkMatrix(a,0,0);
}

private static void checkMatrix(int[][] a, int i, int j) 
{
	if(i<a.length)
	{
		boolean smallestRow=checkInRow(a,i,j,0);
		boolean largestIncol=checkICol(a,i,j,0);
		if(smallestRow && largestIncol)
			System.out.println(a[i][j]);
		if(j<a.length-1)
			j++;
		else
		{
			j=0;
			i++;
		}
		checkMatrix(a, i, j);
		}
	}

private static boolean checkICol(int[][] a, int i, int j, int k) 
{
	if(k<a.length)
	{
		if(a[k][i]>a[i][j])
			return false;
		else
			return checkICol(a, i, j, k+1);
	}
	
	return true;
}

private static boolean checkInRow(int[][] a, int i, int j, int k)
{
	
	if(k<a.length)
	{
		if(a[j][k]<a[i][j])
			return false;
		else
			return checkICol(a, i, j, k+1);
	}
	
	return true;

	}

}
