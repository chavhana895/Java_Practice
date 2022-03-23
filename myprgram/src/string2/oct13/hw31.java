package oct13;

public class hw31 {

	public static void main(String[] args) {
		String s="abcdXYz";
		s=s.toUpperCase();
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			int num=s.charAt(i);
			num=155-num;
			s1=s1+(char)num;
		}
		System.out.println(s1);
	}
}
