package oct14;

public class Repalce 
{
	static String s1="aaabbbccc";
	
	public static void main(String[] args) 
	{
		String s2=s1.replace('a','b');
		System.out.println(s2);
		String s3=MyReplace('a','b');
		System.out.println(s3);
		
	}

	private static String MyReplace(char oldChar, char newChar)
	{
		String ss="";
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch==oldChar)
				ch= newChar;
		ss=ss+ch;
		}
		return ss;
	}

}
