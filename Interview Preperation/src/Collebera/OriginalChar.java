package Collebera;

public class OriginalChar {

	public static void main(String[] args)
	{
		String s="abcdacaba";
		
		for (int i = 0; i < s.length(); i++)
		{
			int cnt=0;
			for (int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
		
		
	
		
//		String s="abcdabcaa";
//	    String s1="";
//		
//		for (int i = 0; i < s.length(); i++)
//		{
//            int cnt=0;
//			for (int j = 0; j < s1.length(); j++)
//			{
//				if(s1.charAt(j)==s.charAt(i))
//					cnt++;
//			}
//			if(cnt==0)
//				s1=s1+s.charAt(i);
//		}
//		
//		System.out.println(s1);
	}

}
