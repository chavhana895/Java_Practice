package String_12_Oct;

public class HW19 {

	public static void main(String[] args) {
		
		String s="abcdabcaba";
		int max=Integer.MIN_VALUE;
		char maxchar='z';
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ch)
					count++;
				
			}
			if(max<count)
			{
				max=count;
				maxchar=ch;
			}				
		}
		System.out.println(maxchar+" "+max);

	}

}
