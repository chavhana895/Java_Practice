package Patterns;

public class Q_01 {

	public static void main(String[] args) {
//		1  2  4  7  11 
//		3  5  8  12 16 
//		6  9  13 17 20 
//		10 14 18 21 23 
//		15 19 22 24 25 
		
		int n = 5;
		int[][] a = new int[n][n];
		int count = 1;
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					if (k + j == i) {
						a[j][k] = count++;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
