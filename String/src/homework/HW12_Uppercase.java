package homework;

public class HW12_Uppercase {

	public static void main(String[] args) 
	{
      String s="Avinash";
      String s1="";
      for (int i = 0; i < s.length(); i++) 
      {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z')
		{
			ch=((char)(ch-32));
			s1=s1+ch;
		}
		else
		{
			s1=s1+ch;
		}
	  }
      System.out.println(s1);
	}

}
