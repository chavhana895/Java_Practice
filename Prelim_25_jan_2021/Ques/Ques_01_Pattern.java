package Ques;

public class Ques_01_Pattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j + i >= 4 && j - i <= 4) {
					if (j<5)
						System.out.print((char) (j + i + 61));
					else
						System.out.print((char)((-(j-i-4))+65));
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
