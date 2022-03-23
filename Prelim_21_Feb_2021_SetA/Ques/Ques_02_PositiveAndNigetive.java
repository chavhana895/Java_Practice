package Ques;

public class Ques_02_PositiveAndNigetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9, -1, 3, 6, -6, 7, -2, -4, 5 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] > 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
