package Array;


public class transposeOfMatrix 
{
   public static void main(String[] args) 
	{
		int [][]a= {{45,74,98},
				{23,56,89},
				{34,65,76}};
		int [][]b=new int[3][3];
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				b[i][j]=a[j][i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
		 for (int j = 0; j < b[i].length; j++) 
		 {
			System.out.print(b[i][j]+" ");
		}	
		 System.out.println();
		 
		}
	                  
	}
}


