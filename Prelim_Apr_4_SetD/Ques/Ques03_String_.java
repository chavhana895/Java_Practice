package Ques;

public class Ques03_String_ {

	public static void main(String[] args) {

		String s="abcdXYZ";
//		          ZYXWCBA
		s=s.toUpperCase();
		
		String a="";
		for (int i = 0; i < s.length(); i++) {
			a+=(char)(155-s.charAt(i));
		}
		System.out.println(a);
	}

}
