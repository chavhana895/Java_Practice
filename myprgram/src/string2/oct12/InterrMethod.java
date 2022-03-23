package oct12;

public class InterrMethod {

	public static void main(String[] args) {
		String s2=new String("abcd");// its can store in heap memory and Scp also
		String s3=s2.intern(); // its can get address of SCP s2
		String s4="abcd";
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		

	}

}
