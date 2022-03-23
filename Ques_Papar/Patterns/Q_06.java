package Patterns;

public class Q_06 {

	public static void main(String[] args) {
		
//	       1 
//	      3 5 
//	    7  9  11 
//	   13 15 17 19 
//	 21 23 25 27 29 

		
		int count=1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j+i>=4) {
					System.out.print(count+" ");
					count+=2;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
