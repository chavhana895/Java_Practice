package practice;

public class twoD_Array {

	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 2, 3,3 },
				{ 4, 5, 6 ,8},
				{ 7, 8, 9 ,2} };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		
			for (int j = 0; j < a.length; j++) {
				if(i==0 || i==2 || j==0 || j==3)
				{}
				else
				{
					sum = sum + a[i][j];
				}
				
			}
			
		}
		System.out.println(sum);
	}
}
