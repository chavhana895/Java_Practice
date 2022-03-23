package oct14;

public class hw20 {

	public static void main(String[] args) 
	{
		String s="abcdakkkkkk";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			int count=0;
			char ch=s.charAt(i);
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j)==ch)
					count++;
			}
			if(count==0)
				s1=s1+ch;
		}
		s=s1;
		System.out.println("After Removing Duplicate String :- "+s);
		
	}
}
