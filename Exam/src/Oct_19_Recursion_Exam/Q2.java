package Oct_19_Recursion_Exam;

public class Q2 {

	public static void main(String[] args) 
	{
		int [][]a= { {6,3,1},
				     {9,7,8},
				     {2,4,5} };
		
		int i=0,j=0;
		checkTwoMatrix(a,i,j);
		}

	private static void checkTwoMatrix(int[][] a, int i, int j) 
	{
	  if(i<a.length)
	  { 
		 boolean smallestInRow=checkInRow(a,i,j,0);
		 boolean largestInCol=checkInCol(a,i,j,0);
		 if(smallestInRow && largestInCol)
			 System.out.println(a[i][j]);
		 
		 if(j<a.length-1)
			 j++;
		 else
		 {
			 j=0;i++;
		 }
		 checkTwoMatrix(a, i, j);
	  } 
	}

	private static boolean checkInCol(int[][] a, int i, int j, int k) 
	{
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
				return false;
			else
				return checkInCol(a, i, j, k+1);
		}
		return true;
	}

	private static boolean checkInRow(int[][] a, int i, int j, int k) 
	{
	  if(k<a.length)
	  {
		  if(a[])
	  }
		return false;
	}
	}


