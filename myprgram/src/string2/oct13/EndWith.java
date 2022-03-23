package oct13;

public class EndWith
{
	static String s1="abcaaa";
	static String s2="aaa";
	public static void main(String[] args) 
	{
		System.out.println(s1.endsWith(s2));
		boolean result=myEndWith();
		System.out.println(result);

	}
	private static boolean myEndWith()
	{
		if(s2.length()>s1.length())
			return false;
		int Indexs2=s2.length()-1;
		int Indexs1=s1.length()-1;
		while(Indexs2>= 0)
		{
			if(s1.charAt(Indexs1)!=s2.charAt(Indexs2))
			{
				return false;
			}
			Indexs1--;
			Indexs2--;
		}
		
		return true;
	}

}
