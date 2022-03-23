package oct14;

public class indexofLast {
	static String s1="aaadfdK";
	static String s2="a";
	public static void main(String[] args)
	{
		int s3=s1.lastIndexOf(s2);
		System.out.println(s3);

		int s4=myLastIndexOf();
		System.out.println(s4);

	}
	private static int myLastIndexOf()
	{
		if(s1.length()<s2.length())
			return -1;
		for (int i = s1.length()-1;i>=0; i--)
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
		return -1;
	}

}
