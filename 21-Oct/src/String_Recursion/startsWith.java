package String_Recursion;

public class startsWith {

	public static void main(String[] args) 
	{
	   String s1="ksfsjbv";
	   String s2="ks";
	   if(s2.length()>s1.length())
		   System.out.println(false);
	   else
	   {
		   int i=0, j=0;
		   boolean result=startsWith(s1,i,s2,j);
		   System.out.println(result);
	   }
	   System.out.println(s1.startsWith(s2));
	}

	private static boolean startsWith(String s1, int i, String s2, int j) 
	{
		if(j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
				return startsWith(s1, i+1, s2, j+1);
			else
				return false;
		}
		return true;
	}

}
