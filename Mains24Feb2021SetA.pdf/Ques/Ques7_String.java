package Ques;

public class Ques7_String {

	public static void main(String[] args) {
//		7. Write a program to find largest & smallest word in a
//		string.
		
		String s="We are good students";
		
		String[] a=s.split(" ");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		String S="";
		String L="";
		for (int i = 0; i < a.length; i++) {
			if(a[i].length()<min) {
				min=a[i].length();
				S=a[i];
			}
			if(a[i].length()>max) {
				max=a[i].length();
				L=a[i];
			}
		}
		System.out.println(S);
		System.out.println(L);
	}

}
