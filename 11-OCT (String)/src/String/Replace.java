package String;

public class Replace extends Object {

	public static void main(String[] args) {
		
	String s="abc pqr stu xyz";          //Split
	String [] sa=s.split(" ");
	
	for (int i = 0; i < sa.length; i++) 
	{
		System.out.println(sa[i]);
	}
	
	
	System.out.println();
	System.out.println();
	
	String s1=s.replace("abc", "pqr");  //Replace
			System.out.println(s1);
	}

}
