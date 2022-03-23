package classwork;

public class CW3 
{
	public static void main(String[] args)
	{
	  String s1="Avinash";
	  String s2="avinash";
	 
	  System.out.println(s1.compareTo(s2));
	  
	  int i=0;                     //recursion
	  int result=compareTo(s1,s2,i);
	  System.out.println(result);
	}

	private static int compareTo(String s1, String s2, int i)
	{
	  if(i<s1.length() && i<s2.length())
	  {
		  if(s1.charAt(i)!=s2.charAt(i))
			  return s1.charAt(i)-s2.charAt(i);
		  else
			  return compareTo(s1, s2, i+1);
	  }
	  return s1.length()-s2.length();
	}
}