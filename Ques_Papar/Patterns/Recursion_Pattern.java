package Patterns;

public class Recursion_Pattern {

	public static void main(String[] args) {

		int[][] a = new int[5][5];
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j + i == 4 || j == 4) {
					a[i][j] = count;
				} else if (j + i > 4) {
					a[i][j] = a[i - 1][j] + a[i - 1][j + 1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j + i >= 4)
					System.out.print(a[i][j] + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
