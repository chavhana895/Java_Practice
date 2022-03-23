package Ques;

public class Pattern_01 {

	public static void main(String[] args) {

		for (int i = 2; i < 11; i = i + 2) {
			for (int j = 0; j < 11; j++) { 
				if (j - i <= 0) {
					if (j * 2 == i)
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
