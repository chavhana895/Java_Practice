package Ques;

public class Ques_3Array {

	public static void main(String[] args) {
//		3. Write a program to calculate the subtraction and
//		multiplication of two matrices entered by the user, if
//		multiplication is even then result number should be half of
//		it, if number is prime then result should be triple of it,
//		else result should be double of it
		
		
		int[][] a= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int[][] b= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		int[][] c=new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				int temp=c[i][j];
				if(temp%2==0) {
					a[i][j]=temp/2;
				}
				boolean isPrime=true;
				for (int k = 2; k < temp; k++) {
					if(temp%k==0) {
						isPrime=false;
					}
				}
				if(isPrime) {
					c[i][j]=temp*3;
				}else {
					c[i][j]=temp*2;
				}
				
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
