package oct11StringDemo;

public class strfunctionDemo {

	public static void main(String[] args)
	{
		String s="abcd";
		String s1=new String ("abcde");
//		System.out.println(s);
//		System.err.println(s1);
//	
//		System.out.println(s.charAt(0)); // o/p:- c
//		System.out.println(s.codePointAt(2)); // ascci val:- 99

//		int result=s.compareTo(s1); //s first  assici value( - ) s1 second  assici value
//		System.out.println(result);
//		System.out.println(s.contains(s1));// its copmpare 2 String return result true or false
//	
//		System.out.println(s.concat(s1));//	abcdabcde
//		System.out.println(s.compareToIgnoreCase(s)); /// its rturn 0 its euql && -1 its not equl
//		
//		System.out.println(s.startsWith("ab"));
//		System.out.println(s.endsWith("de"));
		
//		String s3="ccccc";
//		System.out.println(s3.lastIndexOf("c")); //o:p :- 4
//		System.out.println(s3.indexOf("c"));// o;p :- 0
	
		
		/*	 split method
		String a="abc pqr zyx opq ";
		String[] b=a.split(" ");
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		} 
		o/p:-
		abc
		pqr
		zyx
		opq
		   */
		// replace method 
		String a="aaa bbb ccc";
		String b=a.replace("aaa","zzz");
		System.out.println(b); // zzz bbb ccc
		
	}

}
