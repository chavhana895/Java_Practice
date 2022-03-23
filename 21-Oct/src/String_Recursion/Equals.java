package String_Recursion;

public class Equals {

	public static void main(String[] args) 
	{
		String s1="Avi";
		String s2="Avi";
		if(s1.length()!=s2.length())
			System.out.println(false);
		else
		{
			int i=0;
			boolean result=equals(s1,s2,i);
			System.out.println(result);
		}
		System.out.println(s1.equals(s2));
	}

	private static boolean equals(String s1, String s2, int i) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
				return equals(s1, s2, i+1);
			return false;
		}
		return true;
	}

}
