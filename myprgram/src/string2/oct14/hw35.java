package oct14;

public class hw35 {
//) Write a program to delete all extra spaces in string
	public static void main(String[] args) {
		String s1="      sssss  sss     ";
		String s2="";
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			for (int j = 0; j < s1.length(); j++)
			{
				if(ch==' ')
				{
					break;
				}
				else
				{
					s2=s2+s1.charAt(i);
					break;
				}
			}
		}
		System.out.println(s2);

	}

}
