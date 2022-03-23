package ClassWork;

public class UpperCase {
    static String s1="abcdeDD35";
	public static void main(String[] args) 
	{
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3=myUpperCase();
		System.out.println(s3);
				
	}
	private static String myUpperCase() 
	{
		String s="";
		for (int i = 0; i < s1.length(); i++) 
		{
		  char ch=s1.charAt(i);
		  if(ch>='a'&& ch<='z')
		  {
			  s=s+(char)(ch-32);
		  }
		  else
			  s=s+ch;
		}
		return s ;
	}

}
