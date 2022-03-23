package Ques_05;

public class Compare_To_Ignoring {

	public static void main(String[] args) {

		String s1 = "Ab";
		String s2 = "aBcdefgab";

		System.out.println(s1.compareToIgnoreCase(s2));
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.println(s1.charAt(i) - s2.charAt(i));
				}
			}
		}
		else if(s2.length()<s1.length()) {
			int counter=0;
			for (int i = 0; i < s2.length(); i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println(s1.charAt(i)-s2.charAt(i));
					counter++;
					break;
				}
			}
			if(counter==0) {
				System.out.println(s1.length()-s2.length());
			}
			
		}else {
			int counter=0;
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println(s1.charAt(i)-s2.charAt(i));
					counter++;
					break;
				}
			}
			if(counter==0) {
				System.out.println(s1.length()-s2.length());
			}
		}
	}

}
