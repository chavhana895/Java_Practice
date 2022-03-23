package Ques;

import java.util.Scanner;

public class Ques_03_Array_Matrix {

	public static void main(String[] args) {
//		3) Addition of all inner elements of a matrix of n*m 
//		(n and m can be same or different)
		Scanner sc=new Scanner(System.in);
		int n=3;
		int m=4;
		
		int[][] a=new int[n][m];
		int[][] b=new int[m][n];
		
		System.out.println("Enter A matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter B matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] c=new int[a[0].length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for (int i = 0; i < c[0].length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
