package Implementation;

public class EndsWith {

	public static void main(String[] args)
	{
	  String s="ancdfjhkl";
	  String s1="ghgdfgddgk";
	  System.out.println(s.endsWith(s1));
	  
	  int i=s.length()-1;
	  int j=s1.length()-1;
	  int cnt=0;
	  
	  while(j>=0)
	  {
		  if(s.charAt(i)!=s1.charAt(j))
		  {
			  cnt++;
			  break;
		  }
		  j--; i--;
	  }
	  if(cnt!=0)
		  System.out.println(false);
	  else
		  System.out.println(true);
	}

}
