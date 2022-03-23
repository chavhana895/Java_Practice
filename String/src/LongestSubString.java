public class LongestSubString
{
  public static void main(String[] args) 
  {
	String s="abcdabcabcdeabcduhyabcdejg";
	int max=Integer.MIN_VALUE;
	int startIndex=0;
	for (int i = 0; i < s.length(); i++)
	{
		String s1="";
		for (int j = i; j < s.length(); j++)
		{
			int cnt=0;
			for (int k = 0; k < s1.length(); k++)
			{
				if(s1.charAt(k)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				s1=s1+s.charAt(j);
			}
			else
			{
				if(s1.length()>max)
				{
					max=s1.length();
					startIndex=i;
				}
				break;
			}
		}
	}
	System.out.println("Longest length of subString: "+max);
	System.out.println("Index at: "+startIndex);
	System.out.println();
	System.out.println("________________");
	System.out.println("Longest subString is: ");
	for (int i = startIndex; i < startIndex+max; i++)
	{
		System.out.print(s.charAt(i));
	}
  }
}