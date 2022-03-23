package Today_3_1_22;

public class String_lastIndexOf_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int L = 1;
		int R = 10;
		int sum = 0;
		for (int i = L; i <= R; i++) {

			int num = i;
			int temp = num;
			int count = 0;
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			sum = sum + i * count;
		}

		System.out.println(sum);
	}

}
