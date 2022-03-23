package Exam_16_Oct;

public class Q1 {
 static String s="safgyhdsssgshdxyz";
 static String s1="hd";
	public static void main(String[] args) {
		System.out.println(s.indexOf(s1));
		System.out.println(myLastIndex());
	}
	private static int myLastIndex()
	{
		if(s1.length()>s.length())
			return -1;
		for (int i=0; i<s.length();i++)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				int startindex=i+1;
				int count=1;
				int endindex=1;
				while(startindex<s.length()&&endindex<s1.length())
				{
					if(s.charAt(startindex)==s1.charAt(endindex))
						{
						count++;
						}
						startindex++;
					    endindex++;
				}
				if(count==s1.length())
					return i;
			}
		}
		return -1;
	
	
	}
}
