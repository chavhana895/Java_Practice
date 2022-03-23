package String_13_Oct;

public class CodePointAt {

	static String s="abcd";
	public static void main(String[] args) throws Exception 
	{
		int index=3;
		System.out.println(s.codePointAt(index));
		int num=myCodePointAt(index);
		System.out.println(num);
	}
	private static int myCodePointAt(int i) 
	{
		
		return s.charAt(i);
	}

}
