package Ques;

public class Ques_08_String_lastIndexOf {

	public static void main(String[] args) {
		
		String s="abcdefg";
		System.out.println(s.lastIndexOf('a'));
		
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)=='a') {
				System.out.println(i);
				break;
			}
		}
		
	}

}
