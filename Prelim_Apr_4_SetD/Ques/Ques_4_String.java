package Ques;

public class Ques_4_String {

	public static void main(String[] args) {

		String s1 = "Mother In Law";
		String s2 = "Hitler Woman h";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		String a = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				a += s1.charAt(i);
			}
		}
		String b = "";
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				b += s2.charAt(i);
			}
		}

		if (a.length() == b.length()) {
			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();
			for (int i = 0; i < c1.length; i++) {
				for (int j = i + 1; j < c1.length; j++) {
					if (c1[i] > c1[j]) {
						char temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}
					if (c2[i] > c2[j]) {
						char temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}
				}
			}
			boolean result=true;
			for (int i = 0; i < c2.length; i++) {
				if(c1[i]!=c2[i]) {
					result=false;
					System.out.println("Strings are not  anagram");
					break;
				}
			}
			if(result) {	
				System.out.println("Strings are anagram");
			}
		}else {
			System.out.println("Strings are not anagram ");
		}
		
	}

}
