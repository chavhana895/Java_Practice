package String;

public class HW1 {

	public static void main(String[] args) {
		char[]ca= {'H','e','f','s','h','i','n','e'};
		String s="";
			for (int i = 0; i < ca.length; i++) 
		{
			s=s+ca[i];
		}
		
		
		System.out.println(s);
		
		
		System.out.println();    //space purpose
		
		System.out.println();
		
		String s1=new String(ca);   //Alternative Method
		System.out.println(ca);
	}

}



