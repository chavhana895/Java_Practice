package Ques;

public class Ques_6String {

	public static void main(String[] args) {
//		6. Exchange Cipher (String & char)This simple cipher
//		exchanges 'A' and 'Z', 'B' and 'Y', 'C' and 'X', and so on.
//		Write a program called Exchange Cipher that prompts user for
//		a plaintext string consisting of mix-case letters only. Your
//		program shall compute the cipher text; and print the cipher
//		text in uppercase. For examples, Enter a plaintext string: 
//		abcXYZ The cipher text string is: ZYXCBA
		
		String s="abcXYZ";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				s1+=(char)(s.charAt(i)-32);
			}else {
				s1+=s.charAt(i);
			}
		}
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			s2+=(char)(155-s1.charAt(i));
		}
		System.out.println(s2);
	}

}
