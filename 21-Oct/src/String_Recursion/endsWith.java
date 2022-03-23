package String_Recursion;

public class endsWith {

	public static void main(String[] args) 
	{
		String s1="ffgdsgjb";
		String s2="jb";
		if(s2.length()>s1.length())
			System.out.println(false);
		else
		{
			int i=s1.length()-1, j=s2.length()-1;
			boolean result=endsWith(s1,i,s2,j);
			System.out.println(result);
		}
		System.out.println(s1.endsWith(s2));

	}

	private static boolean endsWith(String s1, int i, String s2, int j) 
	{
		if(j>=0)
		{
			if(s1.charAt(i)==s2.charAt(j))
				return endsWith(s1, i-1, s2, j-1);
			else
				return false;
		}
		return true;
	}

}
