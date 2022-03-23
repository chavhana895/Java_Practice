package splitString_COMPARATOR;

import java.util.Set;
import java.util.TreeSet;

public class Myclass {

	public static void main(String[] args) 
	{
		String s="abcde abcd ab abcdefgh dgfasgfi7ssah7h";
		String []sa=s.split(" ");
		myComparator obj=new myComparator();
		Set<String> set=new TreeSet<String>(obj);
		
		for (int i = 0; i < sa.length; i++) 
		{
			set.add(sa[i]);
		}
		System.out.println(set);

	}
}
