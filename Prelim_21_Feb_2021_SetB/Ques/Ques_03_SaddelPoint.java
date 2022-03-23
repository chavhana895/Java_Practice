package Ques;

import java.util.Scanner;

public class Ques_03_SaddelPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				boolean isSmolestInRow=true;
				boolean isLargestInCollum=true;
				
				for (int k = 0; k < a.length; k++) {
					if(a[i][j]>a[i][k]) {
						isSmolestInRow=false;
					}
				}
				
				for (int k = 0; k < a.length; k++) {
					if(a[i][j]<a[k][j]) {
						isLargestInCollum=false;
					}
				}
				
				if(isSmolestInRow && isLargestInCollum) {
					System.out.println(a[i][j]);
				}
				
			}
		}
		
	}

}















