package oct13;

public class ContainMethod {

	static String s1="abcpqrxyz";
	static String s2="abc";
	public static void main(String[] args)
	{
		System.out.println(s1.contains(s2));
		boolean s=mycontains();
		System.out.println(s);

	}
	private static boolean mycontains() 
	{
		if(s1.length()<s2.length())
			return false;
		for (int i = 0; i < s1.length(); i++)
		{
			
			if(s2.charAt(0)==s1.charAt(i))
			{
				int Sindex=i;
				int Sindex2=0;
				int count=0;
				while( Sindex2<s2.length())
				{
					if(s1.charAt(Sindex)==s2.charAt(Sindex2))
						count++;
					Sindex++;
					Sindex2++;
				}
				if(count==s2.length())
					return true;
			}	
		}
	
		return  false;
	}

}
