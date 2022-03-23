package Patterns;

public class Q_05 {

	public static void main(String[] args) {

		int temp = 1;
		for (int i = 0; i < 5; i++) {
			int temp1 = temp + i;
			for (int j = 0; j < 5; j++) {
				if (j + i >= 4) {

					if (i % 2 == 0) {
						System.out.print(temp++ + " ");
					} else {
						System.out.print(temp1-- + " ");
						temp++;
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

}
