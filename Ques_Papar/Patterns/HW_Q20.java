package Patterns;

public class HW_Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int start = 1;
		for (int i = 0; i < 8; i = i + 2) {
			count = start;
			int cou = 2;
			for (int j = 0; j < 9; j++) {
				if (j - i <= 0) {
					if (i <= j * 2)
						System.out.print(count--);
					else
						System.out.print(cou++);
				}
			}
			start++;
			System.out.println();
		}

	}

}
