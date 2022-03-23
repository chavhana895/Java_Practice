package Ques;

public class String_Uppercace_05 {

	public static void main(String[] args) {

//		5 white a program to convert a character to uppercase only if its ascii
//		value is even Input: abcde output:aBcDe
		
		String s = "abcde";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if ((int) (s.charAt(i)) % 2 == 0) {
				s1 += (char) (s.charAt(i) - 32);
			} else {
				s1 += s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
