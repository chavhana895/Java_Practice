package String_13_Oct;

public class lowerToUpperExchange {

	public static void main(String[] args) {
		
		String s="abcdXYZ";
		s=s.toUpperCase();
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		
			/*
			 char ch=s.charAt(i);
			 int num=ch;
			 num=155-num;
			 char ch2=(char)num;
			 s1=s1+ch2;
			 */
			s1=s1+(char)(155-s.charAt(i));
			System.out.println(s1);
	}

}
