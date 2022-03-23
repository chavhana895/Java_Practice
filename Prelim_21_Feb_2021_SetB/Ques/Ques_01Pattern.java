package Ques;

public class Ques_01Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <14 ; i++) {
			for (int j = 0; j < 17; j++) {
				if(j+i>=4 && j-i<=4 && j<9 && j-i>=-5 
						|| j>8 && j+i>=12 && j-i<=12 && j+i<=21) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
