public class MaxRepeatingChar {

	public static void main(String[] args) 
	{
	    String s="abcdabcaba";
	    
	    int max=Integer.MIN_VALUE;
	    char maxChar='z';
	    
	    for (int i = 0; i < s.length(); i++) 
	    {
			char ch=s.charAt(i);
			int cnt=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(s.charAt(j)==ch)
					cnt++;
			}
			if(max<cnt)
				max=cnt;
			maxChar=ch;
	    }
	   System.out.println(maxChar+" "+max);
	}
}