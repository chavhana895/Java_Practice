package oct13;

public class compareToIgnareCase
{
	static String s="Abc";
	static String s1="a";
	public static void main(String[] args)
	{
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(myCompareToIgnoreCase());
	}
	private static int myCompareToIgnoreCase()
	{
		int i=0;
		String ss=s.toLowerCase();
		String sss=s1.toLowerCase();
		while(i<ss.length() && i<sss.length())
		{
			if(ss.charAt(i)!= sss.charAt(i))
				return ss.charAt(i)-sss.charAt (i);
			i++;
			
		}
		return ss.length()-sss.length();
	}

}
