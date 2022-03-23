package Ques;

public class Ques_07_StringRemove {

	public static void main(String[] args) {

		String s1 = "abcadaefgha";
		String s2 = "";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' && count<1) {
				count++;
			}else {
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
