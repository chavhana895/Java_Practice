package String_14_Oct;

public class ReplaceOf {

	static String s1="dsfyss";
	public static void main(String[] args) 
	{
		String s2=s1.replace('d', 'z');
		System.out.println(s2);
		String s3=myReplace('d','z');
		 System.out.println(s3);
	}
	private static String myReplace(char oldChar,char newChar) 
	{
		char[]ca=s1.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==oldChar)
				ca[i]=newChar;
		}
		return new String(ca);
	}
	
}
