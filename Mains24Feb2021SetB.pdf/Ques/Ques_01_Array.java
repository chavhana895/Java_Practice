package Ques;

import java.util.Scanner;

public class Ques_01_Array {

	public static void main(String[] args) {
//		2. Write a program to add outer elements of a
//		matrix(2D array) in an array(1D array)
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int[][] a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == 0 || j == 0 || i == a.length - 1 || j == a.length - 1) {
					count++;
				}
			}
		}
		int[] b = new int[count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == 0 || j == 0 || i == a.length - 1 || j == a.length - 1) {
					b[index++] = a[i][j];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
