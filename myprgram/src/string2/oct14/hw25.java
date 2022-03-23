package string2.oct14;

public class hw25 {

	public static void main(String[] args) {
		String s="abcdabcabaa";
		int min=Integer.MAX_VALUE;
		char minchar=' ';
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ch)
					count++;
			}
			if(min>count)
			{
				min=count;
				minchar=ch;
			}
		}
		System.out.println();
		System.out.println("Lowest Frequncy of char :-"+ minchar +"  "+min);
		

	}

}
