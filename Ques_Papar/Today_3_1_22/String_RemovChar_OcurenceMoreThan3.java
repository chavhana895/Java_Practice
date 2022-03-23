package Today_3_1_22;

public class String_RemovChar_OcurenceMoreThan3 {

	public static void main(String[] args) {

		String s1 = "aaaabbccddeeeedd";
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++)
		{
			int cnt=0;
			for (int j = 0; j < i; j++) 
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;
			}
			
			if(cnt<2)
			{
				int count=0;
				for (int k = 0; k < s1.length(); k++) 
				{
					if(s1.charAt(i)==s1.charAt(k))
						count++;
				}
				if(count<3)
					System.out.print(s1.charAt(i));
				
			}
		}
		
	}

}
