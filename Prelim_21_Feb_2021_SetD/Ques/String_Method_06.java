package Ques;

public class String_Method_06 {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="abc";
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
			int count=0;
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println(s1.charAt(i)-s2.charAt(i));
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(s1.length()-s2.length());
			}
			
		}else if(s1.length()>s2.length()) {
			
			int count=0;
			for (int i = 0; i < s2.length(); i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println(s1.charAt(i)-s2.charAt(i));
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(s1.length()-s2.length());
			}
			
		}else {
			int count=0;
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println(s1.charAt(i)-s2.charAt(i));
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(s1.length()-s2.length());
			}
		}
		
	}

}
