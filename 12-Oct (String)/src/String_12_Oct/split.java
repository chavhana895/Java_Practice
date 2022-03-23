package String_12_Oct;

public class split {

	public static void main(String[] args) {
	
		
		String s="abc pqr stu xyz";
		String []sa=s.split(" ");
		
		for (int  i=sa.length-1;i>=0; i--) 
		{
			System.out.println(sa[i]);
		}
		
	
	/*	String s="abc pqr stu xyz";
		String[]sa=s.split(" ");
		
		for (int i = 0; i < sa.length; i++) 
		{
		  String s1=sa[i];
		  for (int j = sa.length()-1;; j++) {
			
		} */
		
	}
}
