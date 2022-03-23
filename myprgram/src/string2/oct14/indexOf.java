package oct14;

public class indexOf {
	static String s1="aaabbbccc";
	static String s2="bbb";
	public static void main(String[] args) 
	{
		int s3=s1.indexOf(s2);
		System.out.println(s3);
		int s4=myIndexOf();
		System.out.println(s4);

	}
	private static int myIndexOf()
	{
		if(s1.length()<s2.length())
			return -1;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int s1intdex=i+1;
				int s2index=1;
				int counter=1;
				while(s1intdex<s1.length() && s2index<s2.length())
				{
					if(s1.charAt(s1intdex)==s2.charAt(s2index))
						counter++;
					s1intdex++;
					s2index++;
				}
				if(counter==s2.length())
					return i;
			}
			
		}
		return 0;
	}

}
