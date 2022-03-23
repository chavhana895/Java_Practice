package Ques;

public class Q_01Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		int start=1;
		
		for (int i = 0; i < 5; i++) {
			count=start;
			int diff=4;
			for (int j = 0; j < 5; j++) {
				
				if(j-i<=0) {
					System.out.print(count+" ");
					count=count+diff--;
				}
				else {
					System.out.print(" ");
				}
				
			}
			start++;
//			diff--;
			System.out.println();
			
		}
		
	}

}
