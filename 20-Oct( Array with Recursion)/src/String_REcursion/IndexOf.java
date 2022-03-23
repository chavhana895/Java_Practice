package String_REcursion;

public class IndexOf {

	public static void main(String[] args) 
	{
	  String s1="ksfsjbv";
	  String s2="jb";
	  if(s2.length()>s1.length())
		  System.out.println(-1);
	  else
	  {
		  int i=0;
		  int index=indexOf(s1,s2,i);
		  System.out.println(index);
	  }
	  System.out.println(s1.indexOf(s2));
	}

	private static int indexOf(String s1, String s2, int i) 
	{
	  if(i<s1.length())
	  {
		  if(s1.charAt(i)==s2.charAt(0))
		  {
			  int j=0;
			  boolean isS2inS1=isS2inS1checker(s1,i,s2,j);
					  if(isS2inS1==true)
						  return i;
					  else
					return indexOf(s1,s2,i+1);
		  }
		  return indexOf(s1, s2, i+1);
	  }
	  return -1;
	}

  private static boolean isS2inS1checker(String s1, int i, String s2, int j) 
	{
		if(j<s2.length())
		{
			if(i<s1.length())
			{
				if(s1.charAt(i)==s2.charAt(j))
					return isS2inS1checker(s1, i+1, s2, j+1);
				return false;
			}
			return false;
		}
		return true;
	}

}
