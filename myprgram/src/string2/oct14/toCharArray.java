package oct14;

import java.util.Arrays;

public class toCharArray {
	static String s1="shubham"; 
	static char[] s3=mytocharArray();
	public static void main(String[] args)
	{
		char[] s2=s1.toCharArray();
		System.out.println(Arrays.toString(s2));
		
		System.out.println(Arrays.toString(s2));
	}
	private static char[] mytocharArray() {
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			s3[i]=ch;
		}
		return s3;
	}

}
