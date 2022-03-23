package Ques;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 5;
		
		for (int i = 0; i < 5; i++) {
			int start = 5;
			for (int j = 0; j < 5; j++) {
				if (j - i >=0) 
					System.out.print(count);
				 else
					System.out.print(start--);
			}
			System.out.println();
			count--;
			
		}

	}

}
