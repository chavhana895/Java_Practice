package Dec18;

public class Q8 {

	public static void main(String[] args) 
	{
	  String s="abcdbidknd";
	  String s1="";
	  LoopI(s,s1,0);
	  System.out.println(s1);
	}

	private static void LoopI(String s,String s1, int i) 
	{
	  if(i<s.length())
	  {
		  LoopJ(s,s1,i,0);
		  LoopI(s,s1,i+1);
	  }
	}

	private static String LoopJ(String s, String s1, int i, int j) 
	{
		if(j<s.length())
		{
			if(s.charAt(i)=='d')
			{
			 s1=s.replace('d', 'f');
			
			 return s1;
			}
			LoopJ(s, s1, i, j+1);
		}
		return s1;
	}

}
