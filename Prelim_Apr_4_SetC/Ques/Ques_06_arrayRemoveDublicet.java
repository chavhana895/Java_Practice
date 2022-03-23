package Ques;

public class Ques_06_arrayRemoveDublicet {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,1,2,3,3,3,3,3,3};

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
		}

		int[] b = new int[a.length - count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int counter = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
