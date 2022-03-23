package String_13_Oct;

public class Remve_Spaces {

	public static void main(String[] args) {
		
		String s="    abc   pqr   stu   xyz    ";
		int start=0;
		int end=s.length()-1;
		
		while(s.charAt(start)==' ')
			start++;
		while(s.charAt(end)==' ')
			end--;
		String s1="";
		
		for (int i = start; i <=end; i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{}
			else
				s1=s1+s.charAt(i);
			}
		System.out.println(s1);
	}

}
