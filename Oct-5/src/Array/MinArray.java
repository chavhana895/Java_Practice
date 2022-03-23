package Array;

public class MinArray {

	public static void main(String[] args) {
		int [][]b= {{1,2,3},{4,5,6},{7,8,9}};
		int min=b[0][0];
		
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				if(min>b[i][j])
				min=b[i][j];	
			}
		}
		System.out.print(min);
		
	}

}
