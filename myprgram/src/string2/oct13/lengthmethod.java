package oct13;

public class lengthmethod {
	static String s="abcdef";
	public static void main(String[] args) 
	{
		
		int len=lenght();
		System.out.println(len);
	}
	private static int lenght() 
	{
		char[] ca=s.toCharArray();
		int k = 0;
		for (int i : ca)
		{
			k++;
		}
		return k;
	}

}
