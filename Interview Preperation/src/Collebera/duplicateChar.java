package Collebera;

public class duplicateChar 
{
	public static void main(String[] args)
	{
	  String s="abcdabcab";
      String s1="";
	  int cnt=0;
	  for (int i = 0; i < s.length(); i++)
	  {
		for (int j = i+1; j < s.length(); j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
			  cnt++;
			  System.out.print(s.charAt(i));
			  break;
			}
			
		}
	  }	  
	  System.out.println();
	System.out.println(cnt);
	}
}