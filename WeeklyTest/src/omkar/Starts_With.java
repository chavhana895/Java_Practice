package omkar;

public class Starts_With {

	public static void main(String[] args) {
		String s="java";
		String s1="j";
		int cnt=0;
		if(s1.length()<=s.length())
		{
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)!=s.charAt(i))
			{
				System.out.println(false);
				break;
			}
			else
				cnt++;
		}
		if(cnt==s1.length())
			System.out.println(true); 
		}
		else
			System.out.println(false);
	}

}
