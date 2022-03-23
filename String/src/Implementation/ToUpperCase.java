package Implementation;

public class ToUpperCase {

	public static void main(String[] args)
	{
	   String s="abCd";
	   System.out.println(s.toUpperCase());
	   
	   String s1="";
	   
	   for (int i = 0; i < s.length(); i++)
	   {
		if(s.charAt(i)>='a' & s.charAt(i)<='z')
			s1=s1+(char)(s.charAt(i)-32);
		else
			s1=s1+s.charAt(i);
	   }
	   System.out.println(s1);
	}

}
