package Ques;

public class Ques_03Array {

	public static void main(String[] args) {
//		3. Find count of 0’s in the array of 1’s and 0’s without
//		if condition. Input={1,0,1,0,1,0,1,0} O/p=4

		int[] a = { 1, 0, 1, 0, 1, 0, 1, 0 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			while (a[i] == 0) {
				count++;
				break;
			}
		}
		System.out.println(count);
	}

}
