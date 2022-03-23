package oct13;

public class hw36 {
	static String s="abcdef";
	public static void main(String[] args) 
	{
		
		int len=lenght();
		System.out.println("length:- "+len);
	}
	private static int lenght() 
	{
		int len=0;
		for (int i = 0; i < s.length(); i++)
		{
			len++;
		}
		return len;
	}

}
