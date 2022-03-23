package Ques;

public class Pattern_03_ {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 19; j=j+2) {
				if(j+i>=8 && j-i<=8) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}