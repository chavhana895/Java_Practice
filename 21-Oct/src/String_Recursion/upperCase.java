package String_Recursion;

public class upperCase {

	public static void main(String[] args) 
	{
	   String s="abcd@PQR";
	   char[]ca=s.toCharArray();
	   int i=0;
	   toUppercase(ca,i);
	   s=new String(ca);
	   System.out.println(s);
	}

	private static void toUppercase(char[] ca, int i) {
		if(i<ca.length)
		{
			char ch=ca[i];
			if(ch>='a' && ch<='z')
				ca[i]=(char)(ch-32);
			toUppercase(ca, i+1);
		}
	}

}
