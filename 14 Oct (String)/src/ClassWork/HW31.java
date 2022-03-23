package ClassWork;

public class HW31 {

	public static void main(String[] args) {
		
		String s="abcdXYZ";
		s=s.toUpperCase();
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		
			s1=s1+(char)(155-s.charAt(i));
			System.out.println(s1);
	}

}
