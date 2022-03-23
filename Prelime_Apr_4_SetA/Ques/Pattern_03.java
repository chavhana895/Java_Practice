package Ques;

public class Pattern_03 {

	public static void main(String[] args) {
		for (int i = 0; i < 19; i=i+2) {
			
			for (int j = 0; j <9 ; j++) {
				if (j + i <= 16 && j - i <= 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
