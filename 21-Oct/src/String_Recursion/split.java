package String_Recursion;

public class split {

	public static void main(String[] args) {
	
	String s="you are very good student";
	int i=0;
	int spaceCount=0;
	spaceCount=findSpaceCount(s,i, spaceCount);
	String []sa=new String[spaceCount+1];
	String s1="";
	int saIndex=0;
	fillPartsInStringArray(s,i,s1,saIndex,sa);
	for(String ss:sa)
	{
		System.out.println(ss);
	}
	}

	private static void fillPartsInStringArray(String s, int i, String s1, int saIndex, String[] sa) {
	  if(i<s.length())
	  {
		  if(s.charAt(i)==' ')
		  {
			  sa[saIndex++]=s1;
			  s1="";
			  fillPartsInStringArray(s, i+1, s1, saIndex, sa);
		  }
		  else
		  {
			  s1=s1+s.charAt(i);
			  fillPartsInStringArray(s, i+1, s1, saIndex, sa);
		  }  
	  }
	  else
	  {
		  sa[saIndex]=s1;
	  }
	}

	private static int findSpaceCount(String s, int i, int spaceCount) 
	{
		if(i<s.length())
		{
			if(s.charAt(i)==' ')
				spaceCount++;
			return findSpaceCount(s, i+1, spaceCount);
		}
		return spaceCount;
	}

}
