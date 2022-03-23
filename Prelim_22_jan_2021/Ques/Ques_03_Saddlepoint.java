package Ques;

public class Ques_03_Saddlepoint {

	public static void main(String[] args) {

		int[][] a = { { 6, 3, 1 }, { 9, 7, 8 }, { 2, 4, 5 } };
//		6 3 1
//		9 7 8
//		2 4 5

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				boolean isSmallestInRow = true;
				boolean isLargestTnCollum = true;

				for (int k = 0; k < a.length; k++) {
					if (a[i][j] > a[i][k]) {
						isSmallestInRow = false;
					}
				}

				for (int k = 0; k < a.length; k++) {
					if (a[i][j] < a[k][j]) {
						isLargestTnCollum = false;
					}
				}

				if (isLargestTnCollum && isSmallestInRow) {
					System.out.println(a[i][j]);
				}
			}
		}

	}

}
