package String_Problems_Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharCount 
{

	public static void main(String[] args) 
	{
	
		String s="abcdabcaba";
		
		Set<Character> set=new LinkedHashSet<Character>();
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(!set.add(s.charAt(i)))
			{
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
		System.out.println(set);
	}

}
