package oct12;

public class eqaul {
	
	public static void main(String[] args) {
		String s1="abcd"; // Its Addrress Store in ScP{ String constant pull}
		String s2=new String("abcd"); // Adderss Store in Heap memeory
		System.out.println(s1==s2);  // compare memory address
		System.out.println(s1.equals(s2)); // containt cheked
		
		
		System.out.println("\n-----------");
		String s3="abcd";
		String s4="pqr";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("\n-----------");
		String s5="abcd";
		String s6="abcd";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));


	}

}
