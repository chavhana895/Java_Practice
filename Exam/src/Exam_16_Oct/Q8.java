package Exam_16_Oct;

public class Q8 {

	static String s="Avinash";
	static String s1="avinash";
	public static void main(String[] args) 
	{
		int result1=s1.compareToIgnoreCase(s);
		System.out.println(result1);
		int result2=myIgnoreCase();
	    System.out.println(result2);
	}
	private static int myIgnoreCase() 
	{
		if(s.length()==s1.length())
		{
			if(s.charAt(0)==s1.charAt(0))
			{
				
			}
		}
		else
		{
			return -1;
		}
			
		
		return 0;
		
		
	}

}
