package Methods;

public class IndexOf {

	public static void main(String[] args) {
		
		String s1=new String("Computerm");
		System.out.println("index of m is: ");
		int i=s1.indexOf('m');
		System.out.println(i);
		
		System.out.println();
		
		System.out.println("Last index of: ");
		int i2=s1.lastIndexOf('m');
		System.out.println(i2);
		
		System.out.println();
		
		System.out.println("Last index of Passing String: ");
		int i3=s1.lastIndexOf("mp");
		System.out.println(i3);

	}

}
