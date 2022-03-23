
public class saddleRec {

	static int cnt=0;
	public static void main(String[] args)
	{
     int [][]a= {{6,3,1},
    		     {9,7,8},
    	     	 {2,4,5}};
     
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
	  if(j<a.length)
	  {
		  boolean isSmallestInRow=true;
		  boolean isGreatestInCol=true;
		  isSmallestInRow=checkInRow(a,i,j,isSmallestInRow,0);
		  isGreatestInCol=checkInCol(a,i,j,isGreatestInCol,0);
	  }
	}
	private static boolean checkInCol(int[][] a, int i, int j, boolean isGreatestInCol, int k) {
	  if(k<a.length)
	  {
		  if(a[k][j]>a[i][j])
		  {
			  isGreatestInCol=false;
			  return isGreatestInCol;
		  }
		  return checkInCol(a, i, j, isGreatestInCol, k+1);
	  }
		return isGreatestInCol;
	}
	private static boolean checkInRow(int[][] a, int i, int j, boolean isSmallestInRow, int k)
	{
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
