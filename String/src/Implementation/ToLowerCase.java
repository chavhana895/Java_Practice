package Implementation;

public class ToLowerCase {

	public static void main(String[] args)
	{
	   String s="ABCD";
	   System.out.println(s.toLowerCase());
	   
	   String s1="";
	   
	   for (int i = 0; i < s.length(); i++)
	   {
		 if(s.charAt(i)>='A' & s.charAt(i)<='Z')
			 s1=s1+(char)(32+s.charAt(i));
		 else
			 s1=s1+s.charAt(i);
	   }
	   System.out.println(s1);
	}

}
