package Patterns;

public class Q_03 {

	public static void main(String[] args) {
		
//		1  2  3  4 
//		12 13 14 5 
//		11 16 15 6 
//		10 9  8  7 
		
		int n=4;
		int[][] a=new int[n][n];
		int count=1;
		int imin=0, imax=n-1, jmin=0, jmax=n-1 ;
		
		while(imin<=imax) {
			for (int j = jmin; j <= jmax; j++) {
				a[imin][j]=count++;
			}
			imin++;
			for (int i = imin; i <= imax; i++) {
				a[i][jmax]=count++;
			}
			jmax--;
			for (int j = jmax; j >= jmin; j--) {
				a[imax][j]=count++;
			}
			imax--;
			for (int i = imax; i >= imin; i--) {
				a[i][jmin]=count++;
			}
			jmin++;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		} 
	}

}
