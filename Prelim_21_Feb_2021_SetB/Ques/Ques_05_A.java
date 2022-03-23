package Ques;

public class Ques_05_A {

	public static void main(String[] args) {
		
		String s="abcdefabcdefgh";
//				  01234567890123
		int max=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		for (int i = 0; i < s.length(); i++) 
		{
//			int count=0;
			int j = i+1;
			for (; j < s.length(); j++) 
			{
				int cnt=0;
				for (int k = i; k < j; k++)
				{
					if(s.charAt(j)==s.charAt(k))
					{
						cnt++;
						break;
					}
				}
				if(cnt!=0)
				{
//					count++;
					break;
				}
				
				if(j==s.length())
					break;
			}
			int len=j-i;
			if(len>max)
			{
				max=len;
				start=i;
				end=j-1;
			}
			
		}
		
		System.out.println(max);
		for (int i = start; i <= end; i++) 
		{
		System.out.print(s.charAt(i));	
		}

	}

}
