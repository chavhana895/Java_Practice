package ClassWork;

public class SpaceCount {

	public static void main(String[] args) {
		
		String s="abc pqr stu xyz";
		int SpaceCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				SpaceCount++;
			String []sa=new String[SpaceCount+1];
			String s1="";
			int saIndex=0;
			for (int i1 = 0; i1< s.length(); i1++) 
			{
				char ch=s.charAt(i1);
				if(ch==' ')
				{
					sa[saIndex++]=s1;
					s1="";
				}
				else if(i==s.length()-1)
				{
					s1=s1+ch;
					sa[saIndex++]=s1;
				}
				else
				{
					s1=s1+ch;
				}
			}
			for (int j = 0; j < sa.length; j++) 
			{
				System.out.println(sa[j]);
			}
		}
	}

}
