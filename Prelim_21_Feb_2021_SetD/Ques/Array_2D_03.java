package Ques;

public class Array_2D_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{1,2,3,4},
				{3,3,5,5},
				{2,8,7,6},
				{1,9,8,7}
		};
		
		int sum=0;
		int cou=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j!=0 && i!=0 && j!=a.length-1 && i!=a.length-1) {
					int count=0;
					for (int k = 2; k < a[i][j]-1; k++) {
						if(a[i][j]%k==0) {
							count++;
						}
					}
					if(count==0) {
						cou++;
						sum+=a[i][j];
					}
					
				}
			}
			System.out.println();
		}
		System.out.println(sum/cou);
	}

}
