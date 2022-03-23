package Methods;

public class AllinONE {

	static String s="Ajinkya";
	public static void main(String[] args) 
	{
		String s1=new String("Amruta");
		String s2=new String ("Amruta");
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		String s4=s2.toLowerCase();
		System.out.println(s4);
		
		String s5=s2.replace('r', 'R');
		System.out.println(s5);
		
		String s6=new String("amRUTa");
		boolean s7=s2.equalsIgnoreCase(s6);
		System.out.println(s7);
		
		String s8=s1.substring(1);
		System.out.println(s8);
		
		int s9=s1.compareTo(s2);
		System.out.println(s9 );
		boolean s71=s2.matches(s1);
				System.out.println(s71);
		
	}

}
