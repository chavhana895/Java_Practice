 package Ques;

import java.util.Scanner;

public class Ques_05_StringArray {

	public static void main(String[] args) {
//		5. Write a program to get lowest frequency of a character
//		in a string provided frequency number is not in given array. 
//		Take array input from user.
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		String s="abbcccddddeeeeeffffff";
		int min=Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				int charCount=0;
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(i)==s.charAt(j)) {
						charCount++;
					}
				}
				int cou=0;
				for (int j = 0; j < a.length; j++) {
					if(charCount==a[j]) {
						cou++;
					}
				}
				if(cou==0) {
					if(charCount<min) {
						min=charCount;
						index=i;
					}
				}
			}		
		}
		System.out.println(s.charAt(index)+" "+min);
	}

}
