package String;

public class reverseString {

	public static void main(String[] args)
	{
		 String s="Avinash";
		  String s1="";
	  
		  for (int i = 0; i < s.length(); i++)
		  {
			s1=s.charAt(i)+s1;
		  }
		  s=s1;                        //reverse the String
		  System.out.println(s1);
		  System.out.println(s);
		  
		  
//		  for (int i =s.length()-1; i>=0; i--)
//		  {
//			System.out.print(s.charAt(i));
//		  }
	}

}
