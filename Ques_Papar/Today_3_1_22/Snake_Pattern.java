package Today_3_1_22;

public class Snake_Pattern {

	public static void main(String[] args) {

		int count=1;
		for (int i = 0; i < 5; i++) {		
			int start=count+1;
			for (int j = 0; j < 5; j++) {
				if(j+i>=4) {
					if(i%2==0) {
						System.out.print(count++ +" ");
					}else {
						System.out.print(start-- +" ");
						count++;
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
