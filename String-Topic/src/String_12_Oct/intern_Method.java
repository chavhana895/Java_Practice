package String_12_Oct;

public class intern_Method {

	public static void main(String[] args) {
		
		String s2=new String ("abcd");
		String s3=s2.intern();
		String s4="abcd";
		
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		

	}

}
