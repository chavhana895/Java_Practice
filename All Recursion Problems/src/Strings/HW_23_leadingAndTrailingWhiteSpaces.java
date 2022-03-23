package Strings;

public class HW_23_leadingAndTrailingWhiteSpaces {

	public static void main(String[] args) 
	{
	    String s="        kxffgjn     ";
	    int i=0; int j=s.length()-1;
	    i=findRealI(s,i);
	    j=findRealJ(s,j);
	    String s1="";
	    String sNew=takeSubString(s,i,j,s1);
	    System.out.println(s);
	    System.out.println(sNew);
	}

	private static String takeSubString(String s, int i, int j, String s1) {
		if(i<=j)
		{
			s1=s1+s.charAt(i);
			return takeSubString(s, i+1, j, s1);
		}
		return s1;
	}

	private static int findRealJ(String s, int j) {
		if(j>=0)
		{
			if(s.charAt(j)==' ')
				return findRealJ(s, j-1);
			return j;
		}
		return j;
	}

	private static int findRealI(String s, int i) {
		if(i<s.length())
		{
			if(s.charAt(i)==' ')
				return findRealI(s, i+1);
			return i;				
		}
		return i;
	}

}
