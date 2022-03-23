package array20_oct;

public class saddelPoint {

	public static void main(String[] args) {
		int a[][]= {{6,3,1},
				{9,7,8},
				{2,4,5}};
	saddelPointmethod(a,0,0);

	}

	private static void saddelPointmethod(int[][] a, int i, int j) 
	{
		if(i<a.length)
		{
			if(check(a,i,j,0))
				System.out.println(a[i][j]);
			if(j<a.length-1)
				j++;
			else
			{
				j=0;i++;
			}
			saddelPointmethod(a, i, j);
		}
		
	}

	private static boolean check(int[][] a, int i, int j, int k) {
		if(k<a.length)
		{
			if(a[i][k]>a[i][j])
				return false;
			if(a[k][j]<a[i][j])
				return false;
			else
				check(a, i, j, k+1);
		}
		return true;
	}

}
