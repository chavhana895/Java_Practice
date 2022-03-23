package Ques_06;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="adefapaqrab";
		String s2="ab";
		boolean istrue=false;
		if(s2.length()<=s1.length()) {
			for (int i = 0; i < s1.length()-s2.length()+1; i++) {
				if(s1.charAt(i)==s2.charAt(0)) {
					String sub="";
					for (int j = i; j < i+s2.length(); j++) {
						sub+=s1.charAt(j);
					}
					if(sub.equals(s2)) {
						istrue=true;
						break;
					}
				}
			}
			System.out.println(istrue);
		}
		else {
			System.out.println(false);
		}
		
	}

}
