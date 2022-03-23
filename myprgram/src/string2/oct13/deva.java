package oct13;

public class deva {

	public static void main(String[] args) {
		String s="abcdXYz";
		s=s.toUpperCase();
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			int num=ch;
			num=155-num;
			s1=s1+(char)num;
		}
		System.out.println(s1);
		

	}

}
