package Implementation;

import java.util.Arrays;

public class ToCharArray 
{

	public static void main(String[] args)
	{
	  String s="hdsisksdsd";
	  
	  char[] ca=s.toCharArray();
	  System.out.println(Arrays.toString(ca));
	  
	  char[]ca2=new char[s.length()];
	  
	  for (int i = 0; i < s.length(); i++)
	  {
		ca2[i]=s.charAt(i);
	  }
	  System.out.println(Arrays.toString(ca2));
	}
}