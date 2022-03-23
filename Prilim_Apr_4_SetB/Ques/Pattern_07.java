package Ques;

public class Pattern_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		int[][] a=new int[n][n];
		int count=0;
		if(n%2==0) {
			count=n/2;
		}else {
			count=n/2+1;
		}
		int imin=0, imax=n-1, jmin=0, jmax=n-1;
		
		while(imax<=imax) {
			
			for (int j = jmin; j <= jmax; j++) {
				a[imin][j]=count;
			}
			imin++;
			for (int i = imin; i <= imax; i++) {
				a[i][jmax]=count;
			}
			jmax--;
			for (int i = 0; i < a.length; i++) {
				
			}
		}
		
	}

}
