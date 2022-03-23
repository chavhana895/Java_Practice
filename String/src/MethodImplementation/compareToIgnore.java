package MethodImplementation;

public class compareToIgnore {

	public static void main(String[] args)
	{
	  String s="aBcdEfhgj";
	  String s1="aBCd";
	  
	  System.out.println(s.compareToIgnoreCase(s1));
	  
	  s=s.toLowerCase();
	  s1=s1.toLowerCase();
	  int i=0;
	  for(;i<s.length() & i< s1.length(); i++)
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
