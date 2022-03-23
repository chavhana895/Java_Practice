package String_REcursion;

public class compare {

	public static void main(String[] args) 
	{
	  String s1="abcdef";
	  String s2="abcdea";
	  int i=0;
	  int result=compareTo(s1,s2,i);
	  System.out.println(result);
	  System.out.println(s1.compareTo(s2));
	  
	}

	private static int compareTo(String s1, String s2, int i) 
	{
		if(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
						return compareTo(s1,s2,i+1);
		}
		return s1.length()-s2.length();
	}

}
