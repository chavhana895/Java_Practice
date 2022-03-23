package String_Problems_Collection;

import java.util.HashSet;
import java.util.Set;

public class LogestSubString 
{
	public static void main(String[] args) 
	{
		String s="abcdabcdabcaba";
		Set<Character> set=new HashSet<Character>();
		int max=0;
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i; j < s.length(); j++) 
			{
				if(!set.add(s.charAt(j)) || j==s.length()-1)
				{
					if(set.size()>max)
					{
						max=set.size();
						s1=set.toString();
					}
					set.clear();
					break;
				}
			}
		}
        System.out.println(max);
        System.out.println(s1);
	}

}
