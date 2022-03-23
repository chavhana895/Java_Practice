package oct13;

public class hw28sir {

	public static void main(String[] args) {
		String s="       aaa          bbb        cc c      ";
		int start=0;
		int end=s.length()-1;
		String s1="";
		while(s.charAt(start)==' ')
			start++;
		while(s.charAt(end)==' ')
			end--;
		for (int i = start; i <= end ; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ') {}
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
