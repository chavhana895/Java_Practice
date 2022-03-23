package oct14;

public class split {

	public static void main(String[] args) 
	{
		String s1="aaa bbb ccc zzz";
		int spaceCount=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)==' ')
				spaceCount++;
		}
		String sa[]=new String[spaceCount+1];
		String s2="";
		int index=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				sa[index++]=s2;
				s2="";
			}
			else if(i==s1.length()-1)
			{
				
				s2=s2+ch;
				sa[index++]=s2;
			}
			else
				s2=s2+ch;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}

	}

}
