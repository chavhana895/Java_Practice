package Strings;

public class HW_11_toLowercase {

	public static void main(String[] args) 
	{
	  String s="avi@NASH";
	  char []a=s.toCharArray();
	  int i=0;
	  toLowerCase(a,i);
	  s=new String(a);
	  System.out.println(s);
	}

	private static void toLowerCase(char[] a, int i) 
	{
	 if(i<a.length)
	 {
		 char ch=a[i];
		 if(ch>='A' && ch<='Z')
			 a[i]=(char)(ch+32);
		 toLowerCase(a, i+1);
	 }
	}

}
