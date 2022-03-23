package oct11StringDemo;

public class Stingmethod {

	public static void main(String[] args) {
		String a="abcd";
		String b="abcde";
		System.out.println("1. Length of String :"+a.length());
		System.out.println("2. at index point "+a.charAt(3));
		System.out.println("3. return Assci value "+a.codePointAt(0));
		System.out.println("4. compare to method :- "+a.compareTo(b));
		System.out.println("5. compare to ignore case :- "+a.compareToIgnoreCase(b));
		System.out.println("6. concatenation of string :-"+a.concat(b));
		System.out.println("7. endsWith \t d :- "+a.endsWith("d"));
		System.out.println("7. endsWith \t l :- "+a.endsWith("l"));
		System.out.println("8. Start with \t a :- "+a.startsWith("a"));
		System.out.println("8. Start with \t z :- "+a.startsWith("z"));
		System.out.println("9. index of   :-   "+a.indexOf("a"));
		String c="  ";
		String d="";
		System.out.println("10. is Blanck  :-  "+c.isBlank());
		System.out.println("10. is Blanck  :-  "+d.isBlank());
		System.out.println("11. is Empty :-  "+c.isEmpty());
		System.out.println("11. is Empty :-  "+d.isEmpty());
		System.out.println("12. last index of "+a.lastIndexOf("d"));
		
		
	}

}
