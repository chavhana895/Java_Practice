package oct13;

public class compareTo
{
	static String s1="abc";
	static String s2="ABC";
	public static void main(String[] args)
	{
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(myCompareToIgnoreCase());
	}
	private static int myCompareToIgnoreCase()
	{
		int i=0;
		while(i<s1.length() && i<s2.length())
		{
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 != c2)
			{
				c1 = Character.toUpperCase(c1);
				c2 = Character.toUpperCase(c2);
				if (c1 != c2)
				{
					c1 = Character.toLowerCase(c1);
					c2 = Character.toLowerCase(c2);
					if (c1 != c2) 
					{
				
						return c1 - c2;
					}
				}
			}
			
			i++;
		}
		return s1.length()-s2.length();
	}


}
