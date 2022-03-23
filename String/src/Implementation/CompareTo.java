package Implementation;

public class CompareTo {

	public static void main(String[] args)
	{
	  String s="abcde";
	  String s1="abcdevddn";
	  System.out.println(s.compareTo(s1));
	  
	  int i=0;
	  for(;i<s.length() & i<s1.length();i++)
	  {
		  if(s.charAt(i)!=s1.charAt(i))
		  {
			  System.out.println(s.charAt(i)-s1.charAt(i));
			  break;
		  }
	  }
	  if(i==s.length() | i==s1.length())
	  {
		  System.out.println(s.length()-s1.length());
	  }
	}

}
