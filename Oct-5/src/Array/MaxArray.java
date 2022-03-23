package Array;

public class MaxArray {

	public static void main(String[] args) {
		int [][]b= {{1,2,3},{4,15,6},{7,8,9}};
		int max=b[0][0];
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				if(b[i][j]>max)
					max=b[i][j];
			}
		}
		System.out.println(max);

	}

}
