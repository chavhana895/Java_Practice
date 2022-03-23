package String_12_Oct;

public class HW19 {

	public static void main(String[] args) {
		
		String s="abcdabcaba";
		
		int max=0;
		char maxChar='z';
	
		for (int i = 0; i < s.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;
			}
			
			if(max<cnt)
			max=cnt;
			maxChar=s.charAt(i);
		}
		
		System.out.println(maxChar+"   "+max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int max=Integer.MIN_VALUE;
//		char maxchar='z';
//		for (int i = 0; i < s.length(); i++) 
//		{
//			char ch=s.charAt(i);
//			int count=0;
//			for (int j = 0; j < s.length(); j++) 
//			{
//				if(s.charAt(j)==ch)
//					count++;
//				
//			}
//			if(max<count)
//			{
//				max=count;
//				maxchar=ch;
//			}				
//		}
//		System.out.println(maxchar+" "+max);

	}

}
