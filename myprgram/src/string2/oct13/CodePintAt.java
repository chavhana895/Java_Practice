package oct13;

public class CodePintAt {

	static String s="abcd";
	public static void main(String[] args)
	{
		int index=1;
		System.out.println(s.codePointAt(index));
		int num=mycodePointAt(index);
		System.out.println(num);

	}
	private static int mycodePointAt(int index) 
	{
		
		return s.charAt(index);
	}

}
