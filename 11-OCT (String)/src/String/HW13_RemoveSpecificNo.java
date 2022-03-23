package String;

public class HW13_RemoveSpecificNo {

	public static void main(String[] args) {
	
		String s="fsdghfgs7f";
		
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!='d')
				s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);

	}

}
