package Dec18;

public class Q7 {

	public static void main(String[] args) 
	{
       String s= "abcdabcaba";
       int cnt=0;
       int i=0;
       int j=i+1;
     LoopI(s,i,j,cnt);
	}

	private static void LoopI(String s, int i, int j, int cnt) 
	{
	  if(s.charAt(i)==s.charAt(j))
	  {
		  cnt++;
		  char temp=s.charAt(i);
		  System.out.println(temp+" "+cnt);
		  LoopI(s, i+1, j, cnt);
		  
	  }

	}

}
