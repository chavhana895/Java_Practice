package Ques;

public class Ques_03_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {2,5,6};
		int a2[] = {4,6,8,10};

		int i = 0;
		int j = 0;
		while (i < a1.length) {
			if (a1[i] == a2[j]) {
				System.out.println(a1[i]);
				j++;
			} else {
				if (j < a2.length) {
					j++;
				}
				if(j>=a2.length-1) {
					j=0;
					i++;
				}
			}
		}
	}
}
