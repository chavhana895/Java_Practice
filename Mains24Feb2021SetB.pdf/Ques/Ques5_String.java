package Ques;

public class Ques5_String {

	public static void main(String[] args) {
//		5. Write a program to trim any leading or trailing whitespace
//		from a given string. Keep n no of spaces at start, where n is
//		no of words in the string
		
		String s="             no of words in the string        ";
		
		int i=0;
		while(s.charAt(i)==' ') {
			i++;
		}
		int j=s.length()-1;
		while(s.charAt(j)==' ') {
			j--;
		}
		String s1="";
		for (int k = i; k <= j; k++) {
			s1+=s.charAt(k);
		}
		System.out.println(s1);
		String[] a=s1.split(" ");
		int n=a.length;
		String s2="";
		
		if(i-n>=0) {
			i=i-n;
		}else {
			i=0;
		}
		if(j+n<s.length()) {
			j=j+n;
		}else {
			j=s.length()-1;
		}
		
		for (int k = i; k <= j; k++) {
			s2+=s.charAt(k);
		}
		System.out.println(s2);
	}

}
