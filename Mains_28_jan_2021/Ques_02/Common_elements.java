package Ques_02;

public class Common_elements {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 5, 7 };
		int[] b = { 2, 3, 5, 6 };
//		int[] a = { 2, 5, 6 };
//		int[] b = { 4, 6, 8, 10 };

		int i = 0;
		int j = 0;
		while (i < a.length - 1 || j < b.length - 1) {
			if (a[i] == b[j]) {
				System.out.println(a[i]);
				j++;
			} else {
				if (j < b.length - 1) {
					j++;
				} else {
					if (i < a.length - 1) {
						j = 0;
						i++;
					}

				}
			}
		}

	}

}
