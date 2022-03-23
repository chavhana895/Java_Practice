package oct13;

public class CharAt
{
	static String s1="shubham";
	static int num=6; 
	public static void main(String[] args) 
	{
		System.out.println(s1.charAt(num));
		char s=myCharAt();
		System.out.println(s);
	}
	private static char myCharAt()
	{
		char ca[]=s1.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(i==num)
			{
				return ca[i];
			}
		}
		return 0;
	}

}
