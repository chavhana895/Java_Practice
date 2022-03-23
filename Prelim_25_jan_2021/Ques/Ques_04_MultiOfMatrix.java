package Ques;

import java.util.Scanner;

public class Ques_04_MultiOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int[][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] b= {{1,2,3},
					{4,5,6},
					{7,8,9}
		};
		
		int[][] c=new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				
				for (int k = 0; k < b[0].length; k++) {
					c[i][j]=c[i][j] + a[i][k]*b[k][j]; 
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
