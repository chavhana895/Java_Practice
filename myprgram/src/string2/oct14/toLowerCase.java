package oct14;

public class toLowerCase {
	static String s1="aaadfdKLL";
	public static void main(String[] args) 
	{
		String s2=s1.toLowerCase();
		System.out.println(s2);
		String s3=myLoweeCasea();
		System.out.println(s3);

	}
	private static String myLoweeCasea() {
		String s="";
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z' )
				s=s+(char)(ch+32);
			else
				s=s+ch;
		}
		return s;
	}


}
