
public class Q5 {

	public static void main(String[] args)
	{
	  String s="abadecdabcaba";
	  String s1="";
	 
	  for (int i = 0; i < s.length(); i++)
	  {
		  char ch=s.charAt(i);
		  int cnt=0;
		 for (int j = 0; j < s1.length(); j++)
		 {
			if(s1.charAt(j)==ch)
			{
				cnt++;
			}
			
		 }
		 if(cnt==0)
		  s1=s1+ch;
	  }
	  
	  System.out.println(s1);
	}
}
