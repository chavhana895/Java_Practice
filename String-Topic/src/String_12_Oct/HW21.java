package String_12_Oct;


public class HW21 {

	public static void main(String[] args) {
		
		String s="abcdabcabcdeabcaba";
		int max=Integer.MIN_VALUE;
		int startindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			String s1="";
			for (int j = i; j < s.length(); j++) 
			{
				char ch=s.charAt(j);
				int count=0;
				for (int k = 0; k < s1.length(); k++) 
				{
					if(s1.charAt(k)==ch)
					{
						count++;
					}
				}
				if(count==0)
					s1=s1+ch;
				else
				{
					if(max<s1.length())
					{
						max=s1.length();
						startindex=i;
					}
					break;
				}
			}
		}
		System.out.println(max);
		System.out.println(startindex);
		for (int i = startindex; i <startindex+max; i++) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
