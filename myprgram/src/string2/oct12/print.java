package oct12;

public class print {
// wrong 
	public static void main(String[] args) {
		String s="abcgffcvvx";
		String s1="";
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j)==ch)
				
					count++;
					//break;
				
			}
			if(count==0)
				s1=s1+ch;
			
		}
		System.out.println(s1);
		
	}

}
