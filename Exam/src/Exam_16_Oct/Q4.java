package Exam_16_Oct;

public class Q4 {

	public static void main(String[] args) {
		
		String  s="   Hef     shine   ";
		String s1="";
		int startIndex=0;
		int endIndex=0;
		while(true)
		{   if(s.charAt(startIndex)==' ')
			startIndex++;
		else
			break;
		}
		while(true)
		{
			if(s.charAt(endIndex)==' ')
				endIndex--;	
			else
				break;
		}
		for (int i = startIndex; i < endIndex; i++) 
		{
			if(s.charAt(i)==' ')
			{}
			
		}
		System.out.println(s1);
	}

}
