package String_12_Oct;

public class OriginalElement {

	public static void main(String[] args) {
		
		String s="abcdabcaa";
		String s1="";
		
		for (int i = 0; i < s.length(); i++)
		{
			int cnt=0;
			char ch=s.charAt(i);
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j)==ch)
					cnt++;
			}
			if(cnt==0)
				s1=s1+ch;
		}
		
		System.out.println(s1);
		
		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			char ch=s.charAt(i);
//			int count =0;
//			for (int j = 0; j < s1.length(); j++) 
//			{
//				if(s1.charAt(j)==ch)
//					count++;
//			}
//			if(count==0)
//				s1=s1+ch;
//		}
//		System.out.println(s1);
	}
}