
public class StringLexicography {

	public static void main(String[] args)
	{
	String s1="avinash";
	String s2="AVInash";
	
	System.out.println(s1.compareToIgnoreCase(s2));
	
	int result=comapareToIgnoreCase(s1,s2,0);
	System.out.println(result);
	}

	private static int comapareToIgnoreCase(String s1, String s2, int i)
	{
	  if(i<s1.length() && i<s2.length())
	  {
		 if(s1.charAt(i)==s2.charAt(i))
			 return s1.charAt(i)-s2.charAt(i);
		 else
			 return comapareToIgnoreCase(s1, s2, i+1);
	  }
		return s1.length()-s2.length();
	}

}
