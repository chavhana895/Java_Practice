package Ques;

public class Ques_08_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";	
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			s2+=s1.charAt(i);
			s2+=s1.charAt(i);
		}
		
		System.out.println(s2);
		
	}

}
