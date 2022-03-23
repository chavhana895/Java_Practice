package HW;

public class HW13 {

	public static void main(String[] args)
	{
//	  int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
//	  
//	  int N=3;
//	 
//	 for (int col = 0; col < N; col++)
//	 {
//		int startCol=col, startRow=0;
//	
//	    while(startCol>=0 && startRow<N)
//	   {
//		 System.out.print(a[startRow][startCol]+" ");
//		 startCol--;
//		 startRow++;
//	   }
//	   System.out.println();
//	 }
//	 for (int row = 0; row < N; row++)
//	 {
//	    	int startRow=row, startCol=N-1;
//	    	while(startRow<N  && startCol>=0)
//	    	{
//	    		System.out.print(a[startRow][startCol]+" ");
//	    		startCol--;
//	    		startRow++;
//	    	}
//	    	System.out.println();
//	 }
		
		
		int [][]a= {{1,2,3},
			    	{4,5,6},
				    {7,8,9}};
		//int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(j+i==2)
					System.out.println(a[i][j]);
				
			}
		}
		//System.out.println(sum);
	}
}
