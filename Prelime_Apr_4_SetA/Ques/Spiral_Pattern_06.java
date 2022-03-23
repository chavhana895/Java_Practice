package Ques;

public class Spiral_Pattern_06 {

	public static void main(String[] args) {

		int n = 4;
		int[][] a = new int[n][n];
		int count = 1;
		int imin = 0, imax = a.length-1, jmin = 0, jmax = a.length-1;
		while (imin <= imax) {
			for (int j = jmin; j <= jmax; j++) {
				a[imin][j] = count++;
			}
			imin++;
			for (int i = imin; i <= imax; i++) {
				a[i][jmax] = count++;
			}
			jmax--;
			for (int j = jmax; j >= jmin; j--) {
				a[imax][j] = count++;
			}
			imax--;
			for (int i = imax; i >= imin; i--) {
				a[i][jmin] = count++;
			}
			jmin++;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
