package Ques;

public class Ques_05_leadingAndTrailingSpace {

	public static void main(String[] args) {
		
		String s="     Hef         Shine       ";
		
		int i=0;
		int j=s.length()-1;
		
		while(s.charAt(i)==' ') {
			i++;
		}
		while(s.charAt(j)==' ') {
			j--;
		}
		String s1="";
		for (int j2 = i; j2 <= j; j2++) {
			s1+=s.charAt(j2);
		}
		String s2="";
		for (int k = 0; k < s1.length(); k++) {
			if(s1.charAt(k)==' ' && s1.charAt(k+1)==' ') {
				
			}
			else {
				s2+=s1.charAt(k);
			}
		}
		System.out.println(s2);
	}

}
