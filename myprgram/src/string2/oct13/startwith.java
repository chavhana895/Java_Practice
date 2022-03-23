package oct13;

public class startwith {


	static String s1="aaabcaaa";
	static String s2="aaa";
	public static void main(String[] args) 
	{
		System.out.println(s1.startsWith(s2));
		boolean result=myStartWith();
		System.out.println(result);

	}
	private static boolean myStartWith()
	{
		if(s2.length()>s1.length())
			return false;
		
		int Indexs1=0;
		while(Indexs1 < s2.length())
		{
			if(s1.charAt(Indexs1)!=s2.charAt(Indexs1))
			{
				return false;
			}
			Indexs1++;
			
		}
		
		return true;
	}


}
