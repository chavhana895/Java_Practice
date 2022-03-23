package Ques_08;

public class largest_Num {

	public static void main(String[] args) {

		int n = 145;
		int temp = n;
		int d = 4;
		int num1 = 0;
		int digicount = 0;
		int num = 0;
		while (temp > 0) {
			num1 = temp % 10;
			temp = temp / 10;
			digicount++;
		}
		int[] b = new int[digicount];
		int index = 0;
		while (n > 0) {
			num = n % 10;
			n = n / 10;
			if (num >= 4) {
				if (num == d) {
					num = num - 1;
				} else {
					for (int i = num; i < 9; i++) {
						num++;
					}
				}
			}
			b[index++] = num;
		}

		int i = 0;
		int j = b.length - 1;

		while (i < j) {
			int temp2 = b[i];
			b[i] = b[j];
			b[j] = temp2;
			i++;
			j--;
		}

		for (int j2 = 0; j2 < b.length; j2++) {
			System.out.print(b[j2]);
		}

	}

}
