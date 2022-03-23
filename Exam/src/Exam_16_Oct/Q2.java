package Exam_16_Oct;

public class Q2{

	public static void main(String[] args) {
		
		String s="abcabc";
		int count=0;
		
	for (int i = 0; i < s.length(); i++)               
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				char ch1=s.charAt(i);
				char ch2=s.charAt(j);
				if(ch1==ch2)
				{
					count++;
					System.out.println(ch1);
					break;
					
				}
			}
		}
		System.out.println(count);   
	}

}
