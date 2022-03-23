package String;

public class HW14_testStringContainDigits {

	public static void main(String[] args) {
		
		String s="123456avi";
	
		boolean isOnlyDigits=true;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
			{
				isOnlyDigits=false;
				break;
			}
		}
		
		if(isOnlyDigits==true)
			System.out.println("Only Digit");
		else
			System.out.println("Few Char");    
		
		
		
		
	/*	int i=0;
		for (; i < s.length(); i++) 
		{
		  	if(s.charAt(i)<'0' || s.charAt(i)>'9')
		}*/
	}

}
