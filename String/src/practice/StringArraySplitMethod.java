package practice;

public class StringArraySplitMethod {

	public static void main(String[] args) 
	{
		String s="abc pqr stu xyz";
		int spaceCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				spaceCount++;
		}
		String[]sa=new String[spaceCount+1];
		int saIndex=0;
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				sa[saIndex]=s1;
				saIndex++;
				s1="";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			if(i==s.length()-1)
				sa[saIndex]=s1;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
	}

}
