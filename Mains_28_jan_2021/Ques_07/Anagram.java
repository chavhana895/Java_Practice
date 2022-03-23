package Ques_07;

public class Anagram {

	public static void main(String[] args) {

		String x = "Mother in Law";
		String y = "Hitler Woman";
		x = x.toLowerCase();
		y = y.toLowerCase();
		String s1="";
		for (int i = 0; i < x.length(); i++) {
			if(x.charAt(i)==' ') {
				
			}else {
				s1+=x.charAt(i);
			}
		}
		
		String s2="";
		for (int i = 0; i < y.length(); i++) {
			if(y.charAt(i)==' ') {
				
			}else {
				s2+=y.charAt(i);
			}
		}
		
		if (s1.length() == s2.length()) {
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			for (int i = 0; i < a1.length; i++) {
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

			String s3 = new String(a1);
			String s4 = new String(a2);

			if (s3.equals(s4)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("Not Anagram");
		}

	}

}
