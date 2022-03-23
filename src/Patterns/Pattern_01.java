package Patterns;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int count=1;
		int count2=n*n+1;
		int diff=n-1;
		for (int i = 0; i < n; i++) {
			int temp=count2;
			for (int j = 0; j < n*2; j++) {
				if(j-i>=0 && j<n) {
					System.out.print(count++ +" ");
				}else if(j+i<n*2 && j>=n) {
					System.out.print(temp++ +" ");
				}else {
					System.out.print(" ");
				}
			}
			count2=count2-diff--;
			System.out.println();
		}
		
	}

}
