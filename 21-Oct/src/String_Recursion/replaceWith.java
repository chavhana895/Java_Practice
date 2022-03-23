package String_Recursion;

public class replaceWith {

	public static void main(String[] args) 
	{
	   String s="sfabcdipqrisdaskabcdigsics77abcd";
	 //  String s1="sf";
	   String replaceTo="abcd";
	   String replacedBy="pqr";
	   int i=0;
	   String s1="";
	   s1=replace(s,i,replaceTo,replacedBy,s1);
	   System.out.println(s1);
	 System.out.println(s.replace(replaceTo, replacedBy));  
	}

	private static String replace(String s, int i, String replaceTo, String replacedBy, String s1) 
	{
		if(i<s.length())
		{
			char ch=s.charAt(i);
			if(s.charAt(i)!=replaceTo.charAt(0))
			{
				s1=s1+ch;
				return replace(s,i+1,replaceTo,replacedBy,s1);
			}
			else
			{
				int j=0;
			boolean isThereReplaceTo=findReplaceToHere(s,i,replaceTo,j);
			if(isThereReplaceTo==true)
			{
				s1=s1+replacedBy;
				return replace(s, i+replaceTo.length(), replaceTo, replacedBy, s1);
			}
			else
			{
				s1=s1+s.charAt(i);
				return replace(s, i+1, replaceTo, replacedBy, s1);
			}
		    }
		}
		return s1;
	}

	private static boolean findReplaceToHere(String s, int i, String replaceTo, int j) 
	{
		if(j<replaceTo.length())
		{
			if(i<s.length())
			{
				if(s.charAt(i)==replaceTo.charAt(j))
					return findReplaceToHere(s, i+1, replaceTo, j+1);
				else
					return false;
			}
			return false;
		}
		return true;
	}

}
