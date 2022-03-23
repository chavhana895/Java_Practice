package Patterns;

public class Q_02 {

	public static void main(String[] args) {
		
//		3 3 3 3 3 
//		3 2 2 2 3 
//		3 2 1 2 3 
//		3 2 2 2 3 
//		3 3 3 3 3 
		
		int n=5;
		int[][] a=new int[n][n];
		int imin=0, jmin=0, imax=a.length-1, jmax=a.length-1;
		int count=n;
		if(n%2==0) {
			count=n/2;
		}else {
			count=n/2+1;
		}
		while(imin<=imax) {
			for (int j = jmin; j <= jmax; j++) {
				a[imin][j]=count;
			}
			for (int i = imin; i <= imax; i++) {
				a[i][jmax]=count;
			}
			for (int j = jmax; j > jmin; j--) {
				a[imax][j]=count;
			}
			for (int i = imax; i > imin; i--) {
				a[i][jmin]=count;
			}
			imin++;
			jmin++;
			imax--;
			jmax--;
			count--;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
