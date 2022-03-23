package Ques;

public class Ques_04_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		String s3 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				s3 += s1.charAt(i);
			}
		}
		String s4 = "";
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				s4 += s2.charAt(i);
			}
		}
		if (s3.length() == s4.length()) {
			char[] a1 = s3.toCharArray();
			char[] a2 = s4.toCharArray();

			for (int i = 0; i < a2.length; i++) {
				for (int j = i + 1; j < a2.length; j++) {
					if (a1[i] > a1[j]) {
						char temp = a1[i];
						a1[i] = a1[j];
						a1[j] = temp;
					}
					if (a2[i] > a2[j]) {
						char temp = a2[i];
						a2[i] = a2[j];
						a2[j] = temp;
					}
				}
			}
			
			String x=new String(a1);
			String y=new String(a2);
			if(x.equals(y)) {
				System.out.println("strings are anagram");
			}else {
				System.out.println("strings are not anagram");
			}

		} else {
			System.out.println("strings are not anagram");
		}

	}

}
