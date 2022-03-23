package miniPreExam;

public class Q6 {

	static int count=0;
	public static void main(String[] args) 
	{
	  String s="abdhjfkab";
	  String s1="ab";
	  String s2="xy";
	  int i=0;
	  String s3=myString(s,s1,s2,i);
	
	System.out.println(s.replace("ab", "xy"));
	System.out.println(s);
	}

	private static String myString(String s, String s1, String s2, int i) 
	{
		for (int j = 0; j <s.length(); j++) 
		{  
			if(s.charAt(i)==s1.charAt(0))
			{
			  s.replace("ab", "xy");
			  
			}
		}
		return s;
	
	}

}
