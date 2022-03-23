package Patterns;

public class Q_04 {

	public static void main(String[] args) {
		
//		1 2 3 4 17 18 19 20 
//		 5 6 7 14 15 16  
//		  8 9 12 13   
//		   10 11
		
		int n=4;
		int count=1;
		int count2=n*n+1;  //17
		int diff=n-1;      //3
		
		for (int i = 0; i < n; i++) {
			int temp=count2;
			for (int j = 0; j < 2*n; j++) {
				if(j-i>=0 && j<n) {
					System.out.print(count++ + " ");
				}
				else if(j+i<2*n && j>=n) {
					System.out.print(temp++ + " ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			count2=count2-diff--;
		}
		
		
	}

}
