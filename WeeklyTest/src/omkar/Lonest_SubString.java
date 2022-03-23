package omkar;

public class Lonest_SubString {

	public static void main(String[] args) {
		String s="abcabcdabcdeabcbacabcdef";
		
		int start=0;
		int max=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			String ss="";
			for (int j = i+1; j <s.length(); j++)
			{
				for (int j2 = i; j2 <j-1; j2++)
				{
					if(s.charAt(j2)==s.charAt(j))
					{
						ss=ss+s.charAt(j2);
					}
				}
			if(ss.length()>0)
			{
				int len=j-i;
			if(len>max)
			{
				max=len;
				start=i;
			}
			break;
			}
			if(j==s.length()-1)
			{
				int len=j-i+1;
			if(len>max)
			{
				max=len;
				start=i;
			}
			break;
			}
			}
		}
		for (int i =start; i <start+max; i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
