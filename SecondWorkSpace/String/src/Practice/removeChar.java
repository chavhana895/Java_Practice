package Practice;

public class removeChar {

	public static void main(String[] args) 
	{
      String s="Avinash";
      String s1="";

for (int i = 0; i < s.length(); i++) 
{
	if(s.charAt(i)!='a')
		s1=s1+s.charAt(i);
}
System.out.println(s1);
	}

}
