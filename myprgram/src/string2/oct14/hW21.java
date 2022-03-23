package oct14;

public class hW21 {

	public static void main(String[] args) 
	{
		String s="abcdab1234567890cdeaba";
		int StartIndex=0;
		int max=Integer.MIN_VALUE;
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
						break;
					}
				}
				if(count==0)
					s1=s1+ch;
				else
				{
					if(s1.length()>max)
					{
						max=s1.length();
						StartIndex=i;
					}
					break;
				}
			}
		}
		System.out.println("max number "+max);
		System.out.println("start index with:-"+StartIndex);
		for (int i = StartIndex; i < StartIndex+max; i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
