package Basic;

public class sadlePoint {

	static int count=0;
	public static void main(String[] args) 
	{
	 int[][] a= {{5,2,0},
			 {8,6,7},
			 {1,3,4}};
	 LoopI(a,0);
	}
	private static void LoopI(int[][] a, int i) 
	{
	   if(i<a.length)
	   {
		   LoopJ(a,i,0);
		   LoopI(a,i+1);
	   }
	}
	private static void LoopJ(int[][] a, int i, int j) 
	{
	  if(j<a[i].length)	
	  {
		  boolean isSmallestInRow=true;
		  boolean isLargestInCol=true;
		  isSmallestInRow=checkInRow(a,i,j,isSmallestInRow,0);
		  isLargestInCol=checkInCol(a,i,j,isLargestInCol,0);
		  if(isSmallestInRow && isLargestInCol)
		  {
			  System.out.println(a[i][j]);
			  count++;
		  }
		  LoopJ(a,i,j+1);
	  }
	}
	private static boolean checkInCol(int[][] a, int i, int j, boolean isLargestInCol, int k) {
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
			{
				isLargestInCol=false;
				return isLargestInCol;
			}
			return checkInCol(a, i, j, isLargestInCol, k+1);
		}	
		return isLargestInCol;
	}
	private static boolean checkInRow(int[][] a, int i, int j, boolean isSmallestInRow, int k) {
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
			{
				isSmallestInRow=false;
				return isSmallestInRow;
			}
			return checkInRow(a, i, j, isSmallestInRow, k+1);
		}
		return isSmallestInRow;
	}

}
