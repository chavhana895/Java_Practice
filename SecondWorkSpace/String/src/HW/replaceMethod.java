package HW;

public class replaceMethod {

	public static void main(String[] args) 
	{
		String s="abcdefinewc";
		char[] ca = s.toCharArray();
		
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]=='e')
				ca[i]='p';
		}
		s=new String(ca);
		System.out.println(s);
	}

}
