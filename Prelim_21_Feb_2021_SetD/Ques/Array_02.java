package Ques;

public class Array_02 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			}
			if (a[i] < max1 && a[i] > max2) {
				max2 = a[i];
			}
			if (a[i] < min1) {
				min2 = min1;
				min1 = a[i];
			}
			if (a[i] > min1 && a[i] < min2) {
				min2 = a[i];
			}
		}
		
		int minSqu=min2*min2;
		int maxSqu=max2*max2;
		
		System.out.println(maxSqu-minSqu);
	}

}
