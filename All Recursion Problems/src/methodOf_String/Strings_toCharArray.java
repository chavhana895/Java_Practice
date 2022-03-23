package methodOf_String;

import java.util.Arrays;

public class Strings_toCharArray {

	public static void main(String[] args) 
	{
	   String s="abcdef";
	   char[]ca=s.toCharArray();
	   int i=4;
	   tocharArray(s,ca,i);
	   System.out.println(Arrays.toString(ca));
	}

	private static void tocharArray(String s, char[] ca, int i) 
	{
	   if(i<ca.length)
	   {
		   ca[i]=s.charAt(i);
		   tocharArray(s, ca, i+1);
	   }
	}

}
