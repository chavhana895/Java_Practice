package Strings;

public class HW_28_deleteAllExtraBlankSpaces {

	public static void main(String[] args) 
	{
      String s="    kx    ff   gjn    ";
      s=s.trim();
      String s1="";
      int i=0;
      String sNew=removeExtraSpace(s,i,s1);
      System.out.println(sNew);
	}

	private static String removeExtraSpace(String s, int i, String s1) 
	{
		if(i<s.length())
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				return removeExtraSpace(s, i+1, s1);
			else
			{
				s1=s1+s.charAt(i);
				return removeExtraSpace(s, i+1, s1);
			}
		}
		return s1;
	}

}
