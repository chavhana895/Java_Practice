package oct14;

public class hw19 {
//Write a program to find the maximum occurring character in astring.
	public static void main(String[] args)
	{
		String s="abcdabcabaa";
		int max=Integer.MIN_VALUE;
		char maxchar=' ';
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ch)
					count++;
			}
			if(max<count)
			{
				max=count;
				maxchar=ch;
			}
		}
		System.out.println(maxchar +"  "+max);
		
		
		
		// all pair in sorting
	/*	for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j)==ch)
					count++;
			}
			if(count==0)
				s1=s1+ch;

		}
		for (int i = 0; i < s1.length(); i++)
		{
			 char ch=s1.charAt(i);
			 int count=0;
			 for (int j = 0; j < s.length(); j++)
			 {
				 if(s.charAt(j)==ch)
					 count++;
			}
			 System.out.println(ch+" "+count);
		} /*/

	}

}
