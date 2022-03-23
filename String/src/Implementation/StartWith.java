package Implementation;

public class StartWith {

	public static void main(String[] args)
	{
	   String s="abcfhjjkl";
	   String s1="abcfhjjkl";
	   System.out.println(s.startsWith(s1));
	   
	   int i=0;
	   int j=0;
	   
	   if(s.charAt(i)==s.charAt(j))
	   {
		   int cnt=0;
		   while(j<s1.length())
		   {
			   if(s.charAt(i)!=s1.charAt(j))
			   {
				   cnt++;
				   break;
			   }
			   j++;i++;
		   }
		   if(cnt==0)
			   System.out.println(true);
		   else
			   System.out.println(false);
	   }
	   else
	   {
		   System.out.println(false);
	   }
	}

}
