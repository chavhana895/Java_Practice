package Ques;

public class Ques_02 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i = i + 2) {
			int count = 65;
			for (int j = 0; j < 9; j++) {
				if (j - i <= 0) {
					if (j*2<i) {     //j < i/2
						System.out.print((char) (count++));
						
					} else {
						System.out.print((char) (count--));
						
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
