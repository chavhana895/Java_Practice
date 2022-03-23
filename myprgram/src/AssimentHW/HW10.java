package AssimentHW;

public class HW10 {

	public static void main(String[] args) {
		int [][]matrix= {{1,2,3},{6,5,4},{7,8,9}};
		int temp = 0;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) 
		{
			
			
			for (int j = 0; j < matrix.length; j++) 
			{
				
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(max);
		

	}

}
